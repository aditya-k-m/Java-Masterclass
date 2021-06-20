package threads;

public class anotherThread implements Runnable{
    Countdown c;

    public anotherThread(Countdown c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.doCountdown();
    }
}
