package threads;

public class Message {
    private String message;
    private boolean empty;

    public Message(String message) {
        this.message = message;
        empty = false;
    }

    public synchronized String read(){
//        while(empty){
//            try{
//                wait();
//            } catch (InterruptedException e){
//                System.out.println(e.getStackTrace());
//            }
//        }
        empty = true;
//        notifyAll();
        return message;
    }

    public synchronized void write(String message){
//        while(!empty){
//            try{
//                wait();
//            } catch (InterruptedException e){
//                System.out.println(e.getStackTrace());
//            }
//        }
        this.message = message;
        empty = false;
//        notifyAll();
    }
}
