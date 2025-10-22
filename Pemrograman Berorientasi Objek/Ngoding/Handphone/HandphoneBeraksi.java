public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.hidupkan();
        System.out.println(hp.status);
        hp.lakukanPanggilan();
        System.out.println(hp.status);
        hp.kirimSMS();
        System.out.println(hp.status);
        hp.matikan();
        System.out.println(hp.status);
    }
}
