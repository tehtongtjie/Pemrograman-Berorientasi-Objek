package Bentuk;

public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PI = 3.14159265359;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Radius: " + radius);
        System.out.println("Luas: " + hitungLuas());
    }
}
