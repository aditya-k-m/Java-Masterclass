package threads;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable{
    private ArrayBlockingQueue<String> buffer;

    public Consumer(ArrayBlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        synchronized (buffer){
        while(true) {
            try {
                if (buffer.isEmpty())
                    continue;
                else {
                    if (buffer.peek().equals("EOF")) {
                        System.out.println(Thread.currentThread() + " says XXX >>> Removed EOF and Exiting now <<< XXX");
                        break;
                    } else {
                        System.out.println(Thread.currentThread() + " says -> Removing " + buffer.take() + " from the buffer.");
                        Thread.sleep(random.nextInt(1000));
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Exception: Consumer " + Thread.currentThread() + " was interrupted.");
            }
        }
        }
    }
}
