public class Main {
    public static void main(String[] args) {
        KendaraanListrik[] kendaraan = {
            new MobilListrik(80, 20, 10),
            new MotorListrik(30, 10, 5),
            new MobilListrik(60, 45, 12),
            new MotorListrik(25, 20, 4)
        };

        double totalWaktu = 0;
        double totalEnergi = 0;

        for (KendaraanListrik k : kendaraan) {
            double waktu = k.hitungWaktuPengisian();
            double energi = k.hitungEnergiDibutuhkan();
            totalWaktu += waktu;
            totalEnergi += energi;

            if (k instanceof MobilListrik) {
                System.out.println("Mobil Listrik → waktu: " + waktu + " jam, energi: " + energi + " kWh");
            } else if (k instanceof MotorListrik) {
                System.out.println("Motor Listrik → waktu: " + waktu + " jam, energi: " + energi + " kWh");
            }
        }

        System.out.println("\nTotal waktu pengisian seluruh kendaraan: " + totalWaktu + " jam");
        System.out.println("Total energi dibutuhkan: " + totalEnergi + " kWh");
    }
}
