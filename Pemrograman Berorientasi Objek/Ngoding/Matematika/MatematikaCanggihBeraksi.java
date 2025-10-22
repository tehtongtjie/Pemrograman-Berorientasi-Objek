public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();
        matematikaCanggih.pertambahan(10, 10);
        System.out.println("Hasil pertambahan: " + matematikaCanggih.hasil);
        matematikaCanggih.perkalian(10, 5);
        System.out.println("Hasil perkalian: " + matematikaCanggih.hasil);
        matematikaCanggih.modulus(10, 3);
        System.out.println("Hasil modulus: " + matematikaCanggih.hasil);
    }
}
