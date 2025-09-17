package week4.datmas;

public class main {
    public static void main(String[] args) {

        String[][] datamahasiswa = new DataMahasiswa().datmah;

        for (int i = 0; i < datamahasiswa.length; i++) {
            String nim = datamahasiswa[i][0];
            String nama = datamahasiswa[i][1];
            String mataKuliah = datamahasiswa[i][2];
            String nilai = datamahasiswa[i][3];
            
            System.out.println("NIM: " + nim + ", Nama: " + nama + ", Mata Kuliah: " + mataKuliah + ", Nilai: " + nilai);
        }
        System.out.println(); 

        System.out.println("Rata-rata nilai Budi = " + hitungRataRata("Budi", datamahasiswa));
        System.out.println("Rata-rata nilai Siti = " + hitungRataRata("Siti", datamahasiswa));
        System.out.println("Rata-rata nilai Andi = " + hitungRataRata("Andi", datamahasiswa));
        System.out.println(); 

        System.out.println("Nilai tertinggi Pemrograman: " + cariNilaiTertinggi("Pemrograman", datamahasiswa));
        System.out.println("Nilai tertinggi Basis Data: " + cariNilaiTertinggi("Basis Data", datamahasiswa));
        System.out.println(); 

        System.out.println("Mahasiswa dengan rata-rata tertinggi adalah " + cariMahasiswaRataRataTertinggi(datamahasiswa));
    }
    public static double hitungRataRata(String nama, String[][] data) {
        double totalNilai = 0;
        int jumlahMataKuliah = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i][1].equalsIgnoreCase(nama)) {
                totalNilai += Double.parseDouble(data[i][3]);
                jumlahMataKuliah++;
            }
        }
        return totalNilai / jumlahMataKuliah;
    }

    public static String cariNilaiTertinggi(String mataKuliah, String[][] data) {
        int nilaiTertinggi = -1;
        String namaNilaiTertinggi = "";

        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase(mataKuliah)) {
                int nilaiSaatIni = Integer.parseInt(data[i][3]);
                if (nilaiSaatIni > nilaiTertinggi) {
                    nilaiTertinggi = nilaiSaatIni;
                    namaNilaiTertinggi = data[i][1];
                }
            }
        }
        return namaNilaiTertinggi + " (" + nilaiTertinggi + ")";
    }

    public static String cariMahasiswaRataRataTertinggi(String[][] data) {
        String[] namaMahasiswa = {"Budi", "Siti", "Andi"}; // Daftar nama siswa
        String namaTertinggi = "";
        double rataRataTertinggi = 0.0;
        
        for (String nama : namaMahasiswa) {
            double rataRata = hitungRataRata(nama, data);
            if (rataRata > rataRataTertinggi) {
                rataRataTertinggi = rataRata;
                namaTertinggi = nama;
            }
        }
        return namaTertinggi + " (" + String.format("%.1f", rataRataTertinggi) + ")";
    }
}