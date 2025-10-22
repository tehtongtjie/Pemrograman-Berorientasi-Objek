package Thread;

// Membuat kelas yang mewarisi Thread
class MyThread extends Thread {
    private String threadName;

    // Constructor untuk memberikan nama thread
    MyThread(String name) {
        threadName = name;
    }

    // Override metode run() untuk mendefinisikan logika thread
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Iterasi " + i);
            try {
                Thread.sleep(500); // Memberi jeda 500ms antar iterasi
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " selesai.");
    }
}

// Kelas utama
public class MultithreadingExample {
    public static void main(String[] args) {
        // Membuat dua thread
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        // Memulai thread
        t1.start(); // Memulai eksekusi Thread 1
        t2.start(); // Memulai eksekusi Thread 2
    }
}
