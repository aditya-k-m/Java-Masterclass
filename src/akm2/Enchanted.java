package akm2;

public interface Enchanted<T extends Mage> {
    public void healSelf(T mage);
    public void illusionate(T mage);
    public void defendAll(T mage);
}
