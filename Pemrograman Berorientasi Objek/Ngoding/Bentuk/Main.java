package Bentuk;

public class Main {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(7, "Merah");
        l.printInfo();
        System.out.println();

        BujurSangkar b = new BujurSangkar(5, "Biru");
        b.printInfo();
        System.out.println();

        Silinder s = new Silinder(10, 5, "Hijau");
        s.printInfo();
    }
}
