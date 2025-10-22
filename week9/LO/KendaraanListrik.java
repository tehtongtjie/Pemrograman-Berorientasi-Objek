abstract class KendaraanListrik implements KonsumsiEnergi {
    private double kapasitasBaterai;
    private double dayaSaatIni;
    private double kecepatanPengisian;

    public KendaraanListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    // Getter agar subclass bisa mengakses atribut
    public double getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public double getDayaSaatIni() {
        return dayaSaatIni;
    }

    public double getKecepatanPengisian() {
        return kecepatanPengisian;
    }

    // Method abstrak → wajib diimplementasikan subclass
    public abstract double hitungWaktuPengisian();

    // Implementasi dari interface
    @Override
    public double hitungEnergiDibutuhkan() {
        return kapasitasBaterai - dayaSaatIni;
    }
}
