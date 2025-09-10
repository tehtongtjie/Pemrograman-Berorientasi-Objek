package Week2;
public class Handphone {
    String tipe;
    int harga;
    
    String hidupkan;
    String matikan;
    String lakukanPanggilan;
    String kirimSms;

    // Constructor
    public Handphone(String tipe, int harga, String hidupkan, String matikan, String lakukanPanggilan, String kirimSms) {
        this.tipe = tipe;
        this.harga = harga;
        this.hidupkan = hidupkan;
        this.matikan = matikan;
        this.lakukanPanggilan = lakukanPanggilan;
        this.kirimSms = kirimSms;
    }

    // Method menampilkan detail handphone
    public void detail() {
        System.out.println("Tipe Handphone : " + tipe);
        System.out.println("Harga Handphone: Rp " + harga);
        System.out.println(hidupkan);
        System.out.println(matikan);
        System.out.println(lakukanPanggilan);
        System.out.println(kirimSms);
        System.out.println("-----------------------");
    }
}
