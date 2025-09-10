package Week2;
public class Mobilbaru {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Toyota");
        m.setTahunProduksi(1820);
        m.info();

        Mobil m2 = new Mobil();
        m2.setMerk("Honda");
        m2.setTahunProduksi(2022);
        m2.info();
    }
}
