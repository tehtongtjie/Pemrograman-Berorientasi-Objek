package Barang;

// Definisi class 'Buah'
class Buah {
    // Attribute
    String nama;
    String warna;
    
    // Constructor (Method khusus untuk membuat objek)
    public Buah(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    
    // Method untuk menampilkan informasi tentang buah
    public void tampilInfo() {
        System.out.println("Buah: " + nama + ", Warna: " + warna);
    }
    public static void main(String[] args) {
        // Membuat object (instansiasi dari class Buah)
        Buah apel = new Buah("Apel", "Merah");
        Buah pisang = new Buah("Pisang", "Kuning");
        
        // Memanggil method pada object
        apel.tampilInfo();
        pisang.tampilInfo();
    }
}