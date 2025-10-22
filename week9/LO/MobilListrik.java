class MobilListrik extends KendaraanListrik {
    public MobilListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian() {
        // Efisiensi 90% → waktu × 1.1
        double waktu = (getKapasitasBaterai() - getDayaSaatIni()) / getKecepatanPengisian();
        return waktu * 1.1;
    }
}
