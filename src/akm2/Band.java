package akm2;

import java.util.ArrayList;

public class Band<T extends Mage > extends Squad implements Enchanted<Mage>{

    public ArrayList<T> battalion = new ArrayList<>();

    public Band(String type, int strength, String name) {
        super(type, strength, name);
    }

    @Override
    public void healSelf(Mage mage) {
        System.out.println(mage.getName()+" is healing himself.");
    }

    @Override
    public void illusionate(Mage mage) {
        System.out.println(mage.getName()+" has started an illusion.");
    }

    @Override
    public void defendAll(Mage mage) {
        System.out.println(mage.getName()+" is defending.");
    }

    @Override
    public void march(int distance) {
        System.out.println("The Mages are marching. Distance : "+distance);
    }

    @Override
    public int attack(int duration) {
        if(duration > 0 && duration < 5){
            System.out.println("The Mages' band has initiated an attack.");
            return 10;
        }
        else{
            System.out.println("Duration invalid for Mage class.");
        }
        return 0;
    }

    @Override
    public void retreat() {
        System.out.println("Retreat Initiated.");
    }
}
