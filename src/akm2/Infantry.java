package akm2;

import java.util.ArrayList;

public class Infantry<T extends Warrior> extends Squad{

    public ArrayList<T> battalion = new ArrayList<>();

    public Infantry(String type, int strength, String name) {
        super(type, strength, name);
    }

    @Override
    public void march(int distance) {
        if(distance > 0 && distance < 100){
            System.out.println(super.getName()+"'s warriors are marching.");
        }
        else
            System.out.println("Distance invalid for warrior class.");
    }

    @Override
    public int attack(int duration) {
        if(duration > 0 && duration < 100) {
            System.out.println("The Warriors' attack initiated.");
            return 20;
        }
        else{
            System.out.println("Duration invalid for warrior class.");
            return 0;
        }
    }

    @Override
    public void retreat() {
        System.out.println("Retreat Initiated");
    }
}
