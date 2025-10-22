package Bentuk;

public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        // super(warna);
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        t = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Radius: " + getRadius());
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}
