public class karyawan {
    //atribut dari kelas karyawan
    private String nama;
    private String status;
    private int jamKerja;
    private int jlhLembur;
    private int jlhAbsen;
    private double ptgAbsen;
    private double gaji;
    private double bonuslembur;
    
    // Konstruktor dari kelas karyawan
    public karyawan(String nama, String status, double ptgAbsen, double gaji, double bonuslembur, int jamKerja, int jlhLembur, int jlhAbsen) {
        this.nama = nama;
        this.status = status;
        this.ptgAbsen = ptgAbsen;
        this.gaji = gaji;
        this.bonuslembur = bonuslembur;
        this.jamKerja = jamKerja;
        this.jlhLembur = jlhLembur;
        this.jlhAbsen = jlhAbsen;
    }

    // method
    public double hitungGaji(int jamKerja){
        return gaji*jamKerja;
    }
    
    public double hitungLembur(int jlhLembur){
        return bonuslembur*jlhLembur;
    }
    
    public double hitungAbsen(int jlhAbsen){
        return ptgAbsen*jlhAbsen;
    }

    public String getStatus() {
        return status;
    }
    
    public int getJamKerja() {
        return jamKerja;
    }

    public int getJlhLembur() {
        return jlhLembur;
    }
    
    public int getJlhAbsen() {
        return jlhAbsen;
    }

    public double getPtgAbsen() {
        return ptgAbsen;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonuslembur() {
        return bonuslembur;
    }

    
}
