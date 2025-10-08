public class dog extends animal{
    public dog(String name, int age) {
        super(name, age);
    }

    private String breed;

    public dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("woof, woof." + this.breed);
    }

    @Override
    public String toString() {
        return "Nama: " + this.getName() + ", Umur: " + this.getAge() + ", Jenis: " + this.getBreed();

    
    
}

}
