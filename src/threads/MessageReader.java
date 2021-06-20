package threads;

import java.util.Random;

public class MessageReader implements Runnable{
    private Message m;
    public MessageReader(Message m) {
        this.m = m;
    }

    @Override
    public void run() {
        Random r = new Random();
        for(String latestMessage = m.read(); !latestMessage.equals("EOF"); latestMessage = m.read()){
            System.out.println(latestMessage);
            try{
                Thread.sleep(r.nextInt(2000));
            } catch (InterruptedException e){
                System.out.println(e.getStackTrace());
            }
        }
    }
}
