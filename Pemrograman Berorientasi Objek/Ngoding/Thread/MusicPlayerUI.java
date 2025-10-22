package Thread;

import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Kelas Song untuk merepresentasikan data lagu
class Song {
    private int id;
    private String title;
    private String artist;
    private String songPath;
    private String thumbnailPath;

    public Song(int id, String title, String artist, String songPath, String thumbnailPath) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songPath = songPath;
        this.thumbnailPath = thumbnailPath;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getSongPath() { return songPath; }
    public String getThumbnailPath() { return thumbnailPath; }
}

// Kelas DatabaseManager untuk mengambil data lagu dari database
class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/music_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static List<Song> fetchSongs() {
        List<Song> songs = new ArrayList<>();
        String query = "SELECT * FROM songs";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                songs.add(new Song(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("artist"),
                        rs.getString("songPath"),
                        rs.getString("thumbnailPath")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching songs: " + e.getMessage());
        }
        return songs;
    }
}

// Kelas MusicPlayer untuk memainkan file WAV
class MusicPlayer implements Runnable {
    private String songPath;
    private Clip clip;

    public MusicPlayer(String songPath) {
        this.songPath = songPath;
    }

    @Override
    public void run() {
        try {
            File file = new File(songPath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.err.println("Error playing music: " + e.getMessage());
        }
    }

    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}

// Kelas utama untuk GUI dan logika aplikasi
public class MusicPlayerUI {
    private static MusicPlayer currentPlayer = null;

    public static void main(String[] args) {
        // Fetch songs from database
        List<Song> songs = DatabaseManager.fetchSongs();

        // Frame utama
        JFrame frame = new JFrame("Music Player");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(30, 30, 30));

        // Panel Playlist
        JPanel playlistPanel = new JPanel();
        playlistPanel.setPreferredSize(new Dimension(250, frame.getHeight()));
        playlistPanel.setBackground(new Color(45, 45, 45));
        playlistPanel.setLayout(new BoxLayout(playlistPanel, BoxLayout.Y_AXIS));

        JLabel playlistHeader = new JLabel("Playlist");
        playlistHeader.setForeground(Color.WHITE);
        playlistHeader.setFont(new Font("Arial", Font.BOLD, 16));
        playlistHeader.setAlignmentX(Component.CENTER_ALIGNMENT);
        playlistPanel.add(playlistHeader);
        playlistPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Panel Detail Lagu
        JPanel detailPanel = new JPanel();
        detailPanel.setBackground(new Color(30, 30, 30));
        detailPanel.setLayout(new BoxLayout(detailPanel, BoxLayout.Y_AXIS));

        JLabel thumbnailLabel = new JLabel(new ImageIcon("res/default_thumbnail.png")); // Default thumbnail
        thumbnailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        detailPanel.add(thumbnailLabel);

        JLabel songTitle = new JLabel("No Song Selected");
        songTitle.setForeground(Color.WHITE);
        songTitle.setFont(new Font("Arial", Font.BOLD, 16));
        songTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        detailPanel.add(songTitle);

        JLabel songArtist = new JLabel("No Artist Selected");
        songArtist.setForeground(new Color(180, 180, 180));
        songArtist.setFont(new Font("Arial", Font.PLAIN, 14));
        songArtist.setAlignmentX(Component.CENTER_ALIGNMENT);
        detailPanel.add(songArtist);

        JSlider progressBar = new JSlider(0, 100, 0);
        progressBar.setBackground(new Color(30, 30, 30));
        progressBar.setForeground(Color.ORANGE);
        detailPanel.add(progressBar);

        JButton playButton = new JButton("Play");
        playButton.setBackground(new Color(255, 140, 0));
        playButton.setForeground(Color.WHITE);
        playButton.setFocusPainted(false);
        playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        detailPanel.add(playButton);

        // Tombol untuk menghentikan lagu
        JButton stopButton = new JButton("Stop");
        stopButton.setBackground(new Color(200, 50, 50));
        stopButton.setForeground(Color.WHITE);
        stopButton.setFocusPainted(false);
        stopButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        detailPanel.add(stopButton);

        // Daftar lagu dari database
        for (Song song : songs) {
            JButton songButton = new JButton(song.getTitle() + " - " + song.getArtist());
            songButton.setForeground(Color.WHITE);
            songButton.setBackground(new Color(60, 60, 60));
            songButton.setFocusPainted(false);
            playlistPanel.add(songButton);
            playlistPanel.add(Box.createRigidArea(new Dimension(0, 5)));

            songButton.addActionListener(e -> {
                if (currentPlayer != null) {
                    currentPlayer.stop();
                }
                songTitle.setText(song.getTitle());
                songArtist.setText(song.getArtist());
                thumbnailLabel.setIcon(new ImageIcon(song.getThumbnailPath()));
                currentPlayer = new MusicPlayer(song.getSongPath());
                new Thread(currentPlayer).start();
            });
        }

        // Tombol Play
        playButton.addActionListener(e -> {
            if (currentPlayer != null) {
                new Thread(currentPlayer).start();
            }
        });

        // Tombol Stop
        stopButton.addActionListener(e -> {
            if (currentPlayer != null) {
                currentPlayer.stop();
            }
        });

        frame.add(playlistPanel, BorderLayout.WEST);
        frame.add(detailPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
