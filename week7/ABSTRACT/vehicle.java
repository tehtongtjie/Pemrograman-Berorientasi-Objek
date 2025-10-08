abstract class vehicle {
    abstract void move();
}

class car extends vehicle {
    @Override
    public void move() {
        System.out.println("Mobil ini jalan");
    }

class boat extends vehicle {
    @Override
    public void move() {
        System.out.println("Kapal ini berlayar");
    }

}
}