public class BangunDatarBeraksi {
    public static void main(String[] args) {
        BangunDatar persegi = new BangunDatar(10);
        System.out.println("Luas persegi dengan sisi " + persegi.getSisi() + " yaitu = " + persegi.hitungLuasPersegi());
        System.out.println("Keliling persegi dengan sisi " + persegi.getSisi() + " yaitu = " + persegi.hitungKelilingPersegi());
        System.out.println();

        BangunDatar persegiPanjang1 = new BangunDatar();
        persegiPanjang1.setPanjang(10);
        persegiPanjang1.setLebar(5);
        System.out.println("Luas persegi panjang dengan panjang " + persegiPanjang1.getPanjang() + " dan lebar " + persegiPanjang1.getLebar() + " yaitu = " + persegiPanjang1.hitungLuasPersegiPanjang());
        System.out.println("Keliling persegi panjang dengan panjang " + persegiPanjang1.getPanjang() + " dan lebar " + persegiPanjang1.getLebar() + " yaitu = " + persegiPanjang1.hitungKelilingPersegiPanjang());
        System.out.println();

        BangunDatar persegiPanjang2 = new BangunDatar(14, 5);
        System.out.println("Luas persegi panjang dengan panjang " + persegiPanjang2.getPanjang() + " dan lebar " + persegiPanjang2.getLebar() + " yaitu = " + persegiPanjang2.hitungLuasPersegiPanjang());
        System.out.println("Keliling persegi panjang dengan panjang " + persegiPanjang2.getPanjang() + " dan lebar " + persegiPanjang2.getLebar() + " yaitu = " + persegiPanjang2.hitungKelilingPersegiPanjang());
    }
}
