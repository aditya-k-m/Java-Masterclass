package threads;

public class SharingWorker {

        private String name;
        private boolean active;

        public SharingWorker(String name, boolean active) {
            this.name = name;
            this.active = active;
        }

        public String getName() {
            return name;
        }

        public boolean isActive() {
            return active;
        }

        public synchronized void work(SharedResource sharedResource, SharingWorker otherWorker) {

            while(active) {
                if(sharedResource.getOwner() != this) {
                    try {
                        wait(10);
                    } catch(InterruptedException e) {

                    }
                    continue;
                }

                if(otherWorker.isActive()) {
                    System.out.println(getName() + " : give the resource to the worker " + otherWorker.getName());
                    sharedResource.setOwner(otherWorker);
                    continue;
                }

                System.out.println(getName() + ": working on the common resource");
                active = false;
                sharedResource.setOwner(otherWorker);
            }
        }

}
