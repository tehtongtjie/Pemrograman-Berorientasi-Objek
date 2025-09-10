package week3.perulangan;

import java.util.Scanner;

public class SewaKendaraan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tarifMotor = 120000;
        int tarifMobil = 300000;
        int tarifBus = 1000000;

        System.out.print("Masukkan jumlah hari sewa kendaraan: ");
        int jumlahHari = scan.nextInt();

        int total = 0;

        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("Hari " + i + " - Masukkan jenis kendaraan (motor/mobil/bus): ");
            String jenis = scan.next().toLowerCase();

            if (jenis.equals("motor")) {
                total += tarifMotor;
            } else if (jenis.equals("mobil")) {
                total += tarifMobil;
            } else if (jenis.equals("bus")) {
                total += tarifBus;
            } else {
                System.out.println("Jenis kendaraan tidak valid! Hari " + i + " dilewati.");
            }
        }

        System.out.println("Total biaya sewa selama " + jumlahHari + " hari: Rp " + total);
    }
}
