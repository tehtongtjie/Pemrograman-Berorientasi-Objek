package GUWI;

import javax.swing.*;
import java.awt.*;

public class MusicPlayerUI {

    public static void main(String[] args) {
        // Frame Utama
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

        // Header Playlist
        JLabel playlistHeader = new JLabel("Playlist");
        playlistHeader.setForeground(Color.WHITE);
        playlistHeader.setFont(new Font("Arial", Font.BOLD, 16));
        playlistHeader.setAlignmentX(Component.CENTER_ALIGNMENT);
        playlistPanel.add(playlistHeader);

        playlistPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Spasi kosong

        // Daftar Lagu
        String[] songs = {
                "Satu Bulan - Bernadya",
                "Asing - Juicy Lucy",
                "Die With A Smile - Lady Gaga, Bruno Mars",
                "Kita Ke Sana - Hindia",
                "Birds Of A Feather - Billie Eilish"
        };

        for (String song : songs) {
            JButton songButton = new JButton(song);
            songButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            songButton.setMaximumSize(new Dimension(200, 40));
            songButton.setForeground(Color.WHITE);
            songButton.setBackground(new Color(60, 60, 60));
            songButton.setFocusPainted(false);
            songButton.setBorderPainted(false);
            playlistPanel.add(songButton);
            playlistPanel.add(Box.createRigidArea(new Dimension(0, 5))); // Spasi antar tombol
        }

        // Panel Detail Lagu
        JPanel detailPanel = new JPanel();
        detailPanel.setBackground(new Color(30, 30, 30));
        detailPanel.setLayout(new BoxLayout(detailPanel, BoxLayout.Y_AXIS));

        // Thumbnail Lagu
        JLabel thumbnailLabel = new JLabel();
        thumbnailLabel.setIcon(new ImageIcon("res/default_thumbnail.png")); // Gambar default
        thumbnailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        detailPanel.add(thumbnailLabel);

        detailPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Spasi

        // Informasi Lagu
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

        detailPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Spasi

        // Panel Kontrol Lagu
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(new Color(30, 30, 30));
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));

        // Progress Bar
        JSlider progressBar = new JSlider(0, 100, 0);
        progressBar.setBackground(new Color(30, 30, 30));
        progressBar.setForeground(Color.ORANGE);
        controlPanel.add(progressBar);

        // Tombol Play
        JButton playButton = new JButton("Play");
        playButton.setBackground(new Color(255, 140, 0));
        playButton.setForeground(Color.WHITE);
        playButton.setFocusPainted(false);
        playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        controlPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Spasi
        controlPanel.add(playButton);

        // Gabungkan Panel Detail dan Kontrol
        detailPanel.add(controlPanel);

        // Tambahkan Panel ke Frame
        frame.add(playlistPanel, BorderLayout.WEST);
        frame.add(detailPanel, BorderLayout.CENTER);

        // Tampilkan Frame
        frame.setVisible(true);
    }
}
