package GUWI;

public class Frame {
    private String title;
    private int width;
    private int height;
    private boolean visible;

    public Frame(String title, int width, int height) {
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void add(Button b, Object layout) {
        // do something
    }

    public void pack() {
        // do something
    }
}
