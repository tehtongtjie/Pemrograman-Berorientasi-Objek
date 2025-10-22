abstract class Hewan {
    private String nama;
    private int jumKaki;
    private boolean bisaTerbang = false;

    public Hewan(String nama, int jumKaki, boolean bisaTerbang) {
        this.nama = nama;
        this.jumKaki = jumKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public abstract void bersuara();
    public abstract void makan();

    public void nyamNyam() {
        System.out.println("nyam nyam nyam");
    }

    public void infoHewan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Kaki: " + this.jumKaki);
        System.out.println("Bisa Terbang: " + this.bisaTerbang);
    }
}
