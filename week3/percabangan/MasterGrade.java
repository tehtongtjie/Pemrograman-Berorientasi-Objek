package week3.percabangan;

public class MasterGrade {

    public static String getGrade(int nilai) {
        if (nilai >= 85 && nilai <= 100) {
            return "A";
        } else if (nilai >= 70 && nilai <= 84) {
            return "B";
        } else if (nilai >= 60 && nilai <= 69) {
            return "C";
        } else if (nilai >= 50 && nilai <= 59) {
            return "D";
        } else if (nilai >= 0 && nilai <= 49) {
            return "E";
        } else {
            return "Nilai tidak valid!";
        }
    }

    public static String getStatus(int nilai) {
        if (nilai >= 70 && nilai <= 100) {
            return "Lulus";
        } else if (nilai >= 0 && nilai < 70) {
            return "Gagal";
        } else {
            return "Nilai tidak valid!";
        }
    }
}
