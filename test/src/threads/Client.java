package threads;

public class Client {
    /*
    To perform a task in a separate thread : We need to do four things
    1. Create a task (Create a class which implements runnable), provide the task inside run method
    2. Create a thread
    3. Assign task to the thread (Thread t1 = new Thead(task)
    4. Start the thread (t1.start())
     */

    public static void main(String[] args) {
        System.out.println("Print Hello, this will run by main thread " + Thread.currentThread().getName());
        //Create a new thread which print I am adder class
        Adder adder = new Adder();
        Thread thread1 = new Thread(adder);
        thread1.start();
        //Create a new thread which print I am subtractor class
        Subtractor subtractor = new Subtractor();
        Thread thread2 = new Thread(subtractor);
        thread2.start();
        //The order of printing may vary as each thread is running in parallel
    }
}
