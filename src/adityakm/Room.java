package adityakm;

public class Room {
    private Chair chair;
    private Television tv;

    public Room(Chair chair, Television tv) {
        this.chair = chair;
        this.tv = tv;
    }

    public Chair getChair() {
        return chair;
    }

    public void turnOnTV (){
        System.out.println("This tv having a resolution of "+tv.getResolution()+" has been turned on.");
    }

    public void sitDown(){
        chair.sit();
    }
}
