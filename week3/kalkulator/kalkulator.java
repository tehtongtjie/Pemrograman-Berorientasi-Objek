package week3.kalkulator;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan Pilihan (1/2/3/4) : ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + (a + b));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + (a - b));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + (a * b));
                break;
            case 4:
                System.out.println("Hasil pembagian: " + (a / b));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
