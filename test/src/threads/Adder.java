package threads;

public class Adder implements Runnable{
    @Override
    public void run() {
        System.out.println("I am Adder and I run from this thread : " + Thread.currentThread().getName());
    }
}
