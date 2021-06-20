package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Worker implements  Runnable{
    private String threadColor;
    private ReentrantLock lock;

    public Worker(String threadColor, String threadName, ReentrantLock lock) {
        this.threadColor = threadColor;
        Thread.currentThread().setName(threadName);
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            lock.lock();
            try{
                System.out.format(this.threadColor+"%s -> Count: %d \n", Thread.currentThread().getName(), i);
                Thread.sleep(10);
            } catch ( InterruptedException e){
                System.out.println("Thread Interrupted");
            }
            finally {
                lock.unlock();
            }
        }
    }
}
