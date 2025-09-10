package Week2;
public class hello {
    String name;
    String greeting;

    // Constructor
    public hello(String greeting) {
        this.greeting = greeting; 
    }

    public static void main(String[] args) {
        hello h = new hello("Selamat Datang");
        System.out.println("Hello World " + h.greeting);
    }
}
