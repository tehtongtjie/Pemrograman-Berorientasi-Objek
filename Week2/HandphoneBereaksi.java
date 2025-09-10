package Week2;
public class HandphoneBereaksi {
    public static void main(String[] args) {
        // Buat objek Handphone
        Handphone hp1 = new Handphone(
            "Iphone 14 Pro",
            15000000,
            "Handphone berhasil dihidupkan",
            "Handphone berhasil dimatikan",
            "Sedang melakukan panggilan",
            "Sedang mengirim SMS"
        );

        Handphone hp2 = new Handphone(
            "iPhone 15 Pro",
            20000000,
            "Handphone berhasil dihidupkan",
            "Handphone berhasil dimatikan",
            "Sedang melakukan panggilan",
            "Sedang mengirim SMS"
        );

        // Panggil method detail
        hp1.detail();
        hp2.detail();
    }
}
