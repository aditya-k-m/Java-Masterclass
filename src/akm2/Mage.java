package akm2;

public class Mage implements IMove{
    private String name;
    Agility myAgility;

    public Mage(String name) {
        this.name = name;
        this.myAgility = new Agility("stand");
    }

    public String getName() {
        return name;
    }

    @Override
    public void sprint(int speed) {
        if(speed > 10){
            System.out.println("The Speed is too fast for the mage.");
        }
        else {
            System.out.println(this.name+" is sprinting at the speed of " + speed);
        }
    }

    @Override
    public void walk(int speed) {
        if(speed > 2){
            System.out.println("The Speed is too fast for a mage.");
        }
        else {
            System.out.println(this.name+" is walking at a speed of "+ speed);
        }
    }

    @Override
    public void jump(int height) {
        if(height > 4){
            System.out.println("The height is too large for a mage.");
        }
        else {
            System.out.println(this.name+" has a jumped over as height of "+height);
        }
    }

    @Override
    public boolean fastTravel(String place) {
        if(place.equalsIgnoreCase("Delhi") || place.equalsIgnoreCase("Mumbai")){
            System.out.println(this.name+" has travelled to "+place+".");
            return true;
        }
        System.out.println("Can't go there.");
        return false;
    }

    public boolean changeState(String nextState){
        if (nextState.equalsIgnoreCase("stand") || nextState.equalsIgnoreCase("prone") || nextState.equalsIgnoreCase("crouch")) {
            if (nextState.equalsIgnoreCase("stand"))
                    System.out.println(this.myAgility.stand());
            else if (nextState.equalsIgnoreCase("crouch"))
                    System.out.println(this.myAgility.crouch());
            else if (nextState.equalsIgnoreCase("prone"))
                    System.out.println(this.myAgility.prone());
            else
                    System.out.println("Invalid Case");
            return true;
            }
        return false;
        }

        public void checkState(){
        System.out.println(myAgility.currentState);
        }

    private class Agility implements IAct {

        private String currentState;

        public Agility(String currentState) {
            this.currentState = currentState;
        }

        @Override
        public boolean crouch() {
            this.currentState = "crouch";
            return true;
        }

        @Override
        public boolean stand() {
            this.currentState = "stand";
            return true;
        }

        @Override
        public boolean prone() {
            this.currentState = "prone";
            return true;
        }
    }
}
