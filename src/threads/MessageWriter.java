package threads;

import java.util.Random;

public class MessageWriter implements Runnable{
    private Message m;
    private String[] messages;

    public MessageWriter(Message m, String[] messages) {
        this.m = m;
        this.messages = messages;
    }

    @Override
    public void run() {
        Random r = new Random();
        for (int i = 0; i < this.messages.length; i++){
            m.write(this.messages[i]);
            try {
                Thread.sleep(r.nextInt(2000));
            } catch (InterruptedException e){
                System.out.println(e.getStackTrace());
            }
        }
        this.m.write("EOF");
    }
}
