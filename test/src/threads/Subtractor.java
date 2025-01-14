package threads;

public class Subtractor implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Subtractor and I run from this thread : " + Thread.currentThread().getName());
    }
}