package Week2;
public class Mobil {
    String merk;
    private int TahunProduksi;

    // Setter untuk merk
    void setMerk(String merk) {
        this.merk = merk;
    }
    void setTahunProduksi(int TahunProduksi) {
        if (TahunProduksi > 1990) {
            this.TahunProduksi = TahunProduksi;
        } else {
            System.out.println("Tahun produksi harus lebih besar dari 1990");
        }
    }


    public void info(){
    System.out.println("Merk: " + merk);
    System.out.println("Tahun Produksi: " + TahunProduksi);
    System.out.println("--------------------------------");
    }
}

