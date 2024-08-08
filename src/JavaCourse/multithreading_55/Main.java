package JavaCourse.multithreading_55;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //  multithreading = Process of executing multiple threads simultaneously
        //                   Helps maximum utilization of CPU
        //                   Threads are independent, they don't affect the execution of other threads
        //                   An exception in one thread will not interrupt other threads other threads
        //                   useful for serving multiple clients, multiplayer games, or other mutually independent

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);



        thread1.start();
        thread1.join(); // calling method waits until the specified thread dies of for x milliseconds
        thread2.start();

    }
}
