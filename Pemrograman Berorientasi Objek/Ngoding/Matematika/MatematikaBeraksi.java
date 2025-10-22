public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        mtk.pertambahan(20, 20);
        System.out.println(mtk.hasil);
        mtk.pengurangan(10, 5);
        System.out.println(mtk.hasil);
        mtk.perkalian(10, 20);
        System.out.println(mtk.hasil);
        mtk.pembagian(21, 2);
        System.out.println(mtk.hasil);

        System.out.println();
        System.out.println(mtk.pertambahan(12.5, 28.7, 14.2));
        System.out.println(mtk.pertambahan(12, 28, 14));
        System.out.println(mtk.pertambahan(23, 34));
        System.out.println(mtk.pertambahan(3.4, 4.9));
    }
}
