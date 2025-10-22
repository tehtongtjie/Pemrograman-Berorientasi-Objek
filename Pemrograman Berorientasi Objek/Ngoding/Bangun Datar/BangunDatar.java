public class BangunDatar {
    private double sisi;
    private double panjang;
    private double lebar;

    // Constructor tanpa parameter (default)
    public BangunDatar() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
    }

    // Constructor dengan parameter sisi
    public BangunDatar(double sisi) {
        this.sisi = sisi;
    }

    // Constructor dengan parameter panjang dan lebar
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Accessor variable sisi
    public double getSisi() {
        return sisi;
    }

    // Mutator variable sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Accessor variable panjang
    public double getPanjang() {
        return panjang;
    }

    // Mutator variable panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Accessor variable lebar
    public double getLebar() {
        return lebar;
    }

    // Mutator variable lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double hitungLuasPersegi() {
        return sisi * sisi;
    }
    
    public double hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }

    public double hitungKelilingPersegi() {
        return 4 * sisi;
    }

    public double hitungKelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }
}