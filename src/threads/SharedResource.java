package threads;

public class SharedResource {

    private SharingWorker owner;

    public SharedResource(SharingWorker owner) {
        this.owner = owner;
    }

    public SharingWorker getOwner() {
        return owner;
    }

    public synchronized void setOwner(SharingWorker owner) {
        this.owner = owner;
    }
}