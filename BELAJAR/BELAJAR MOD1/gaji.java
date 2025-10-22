import java.util.ArrayList;

public class gaji {
    ArrayList<karyawan> karyawan = new ArrayList<karyawan>();

    public void tambahKaryawan(karyawan karyawan) {
        this.karyawan.add(karyawan);
    }

    public void hitungGaji(){
        for (karyawan karyawan : this.karyawan) {
            System.out.println("========================================");
            System.out.println("Nama karyawan   : " + karyawan.getNama());
            System.out.println("Status karyawan : " + karyawan.getStatus());
            System.out.println("Jumlah jam kerja: " + karyawan.getJamKerja());
            System.out.println("Gaji            : " + karyawan.hitungGaji(karyawan.getJamKerja()));
            System.out.println("Bonus lembur    : " + karyawan.hitungLembur(karyawan.getJlhLembur()));
            System.out.println("Potongan absen  : " + karyawan.hitungAbsen(karyawan.getJlhAbsen()));
            System.out.println("Gaji akhir      : " + (karyawan.hitungGaji(karyawan.getJamKerja()) + karyawan.hitungLembur(karyawan.getJlhLembur()) - karyawan.hitungAbsen(karyawan.getJlhAbsen())));
            System.out.println("========================================");
            System.out.println();
        }
    }
}