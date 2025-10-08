public class main {
    public static void main(String[] args) {

        Employee manager1 = new Manager("Budi Santoso", 8000000.0);
        Employee staff1 = new Staff("Ani Wijaya", 4000000.0);

        System.out.println("=========================================");
        System.out.println("           DETAIL KARYAWAN MANAGER       ");
        System.out.println("=========================================");
        tampilkanDetailKaryawan(manager1);
        
        System.out.println("\n");

        System.out.println("=========================================");
        System.out.println("            DETAIL KARYAWAN STAFF        ");
        System.out.println("=========================================");
        tampilkanDetailKaryawan(staff1);
        
    }
    public static void tampilkanDetailKaryawan(Employee e) {
        System.out.println("Nama Karyawan    : " + e.getName());
        System.out.println("Gaji Pokok       : Rp " + String.format("%,.2f", e.getSalary()));
        
        // Metode getBonus() yang dipanggil akan disesuaikan secara otomatis
        // berdasarkan tipe objek yang sebenarnya (Manager atau Staff).
        double bonus = e.getBonus();
        System.out.println("Bonus (Dihitung) : Rp " + String.format("%,.2f", bonus)); 
        
        // Metode getTotalSalary() juga menggunakan implementasi getBonus() yang benar.
        System.out.println("Gaji Total       : Rp " + String.format("%,.2f", e.getTotalSalary()));
    }
}