package GUWI;

public class Button {
    private String label;
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean visible;

    public Button(String label, int x, int y, int width, int height) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.visible = false;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public String getLabel() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setActionCommand(String command) {
        // do something
    }

    public void addActionListener(Object listener) {
        // do something
    }
}
