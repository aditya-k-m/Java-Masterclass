package akm2;

public interface Healing<T extends Mage> {
    public void healSquad(Squad squad, Mage mage);
    public void healAll(Mage mage);
}
