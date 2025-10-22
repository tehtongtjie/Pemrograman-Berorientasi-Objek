package GUWI;
import javax.swing.*;

public class TestFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        int result = JOptionPane.showConfirmDialog(frame, "Contoh dialog konfirmasi", "Judul Dialog", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        String message;
        if (result == JOptionPane.OK_OPTION) {
            message = "Anda memilih OK";
        } else if (result == JOptionPane.CANCEL_OPTION) {
            message = "Anda memilih Cancel";
        } else {
            message = "Anda tidak memilih apapun";
        }

        JOptionPane.showMessageDialog(frame, message);
    }
}
