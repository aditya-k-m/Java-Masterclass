package threads;

public class Countdown {
    int count;

    public Countdown(int count) {
        this.count = count;
    }

    public void doCountdown(){
        synchronized (this) {
            for (int i = count; i >= 1; i--) {
                System.out.println("Running from " + Thread.currentThread() + ". Count : " + i);
            }
        }
    }
}
