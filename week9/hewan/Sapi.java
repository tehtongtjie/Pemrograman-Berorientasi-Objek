class Sapi extends Hewan {
    public Sapi(String nama) {
        super(nama, 4, false);
    }

    @Override
    public void bersuara() {
        System.out.println("Moo moo moo");
    }

    @Override
    public void makan() {
        nyamNyam();
    }

    public static void main(String[] args) {
        Sapi s = new Sapi("Sapi");
        s.infoHewan();
        s.bersuara();
        s.makan();
    }
}
