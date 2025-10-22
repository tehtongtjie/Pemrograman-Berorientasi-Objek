package GUWI;
import java.awt.*;

public class TestButton {
    private Frame f;
    private Button b;

    public TestButton() {
        f = new Frame("Test Button", 200, 200);
        b = new Button("Click Me", 80, 80, 40, 40);
        b.setActionCommand("click");
    }

    public void launchFrame() {
        b.addActionListener(new ButtonHandler());
        f.add(b, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TestButton tb = new TestButton();
        tb.launchFrame();
    }
}
