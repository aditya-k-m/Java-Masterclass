package akm2;

public class Hero<T extends Warrior & Enchanted & Healing>{
    T me;

    public Hero(T me) {
        this.me = me;
    }
}
