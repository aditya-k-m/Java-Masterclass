package threads;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable{
    private ArrayBlockingQueue<String> buffer;

    public Producer(ArrayBlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        String[] msgArray = {"23", "seventy four", "89", "a hundered"};
        Random random = new Random();
        synchronized (buffer) {
            for (String element : msgArray) {
                try {
                    System.out.println(Thread.currentThread() + " says -> Adding " + element);
                    buffer.put(element);
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    System.out.println("Exception: " + Thread.currentThread() + " was interrupted and couldn't sleep.");
                }
            }
            System.out.println(Thread.currentThread() + " says XXX >>> Adding EOF and Exiting <<< XXX");
            try {
                buffer.put("EOF");
            } catch (InterruptedException e) {
                System.out.println("the buffer was interrupted");
            }
        }
    }
}
