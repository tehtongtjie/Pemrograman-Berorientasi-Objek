class Perkutut extends Hewan {
    public Perkutut() {
        super("Perkutut", 2, true);
    }

    @Override
    public void bersuara() {
        System.out.println("Kwak kwak kwak");
    }

    @Override
    public void makan() {
        nyamNyam(); // memanggil method dari superclass
    }

    public static void main(String[] args) {
        Perkutut p = new Perkutut();
        p.infoHewan();
        p.bersuara();
        p.makan();
    }
}
