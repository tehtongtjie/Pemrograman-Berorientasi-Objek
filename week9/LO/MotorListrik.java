class MotorListrik extends KendaraanListrik {
    public MotorListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian() {
        // Efisiensi 95% → waktu × 1.05
        double waktu = (getKapasitasBaterai() - getDayaSaatIni()) / getKecepatanPengisian();
        return waktu * 1.05;
    }
}
