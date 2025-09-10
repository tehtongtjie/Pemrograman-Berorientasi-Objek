package week3.percabangan;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nilai: ");
        int nilai = Integer.parseInt(scan.nextLine());

        String status = MasterGrade.getStatus(nilai);
        String grade = MasterGrade.getGrade(nilai);

        if (status.equals("Lulus")) {
            System.out.println("Selamat, anda " + status + "!");
        } else if (status.equals("Gagal")) {
            System.out.println("Maaf, anda " + status + "!");
        } else {
            System.out.println(status);
        }

        System.out.println("Grade: " + grade);
    }
}
