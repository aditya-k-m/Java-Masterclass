package akm2;

public interface IMove {
    void sprint(int speed);
    void walk(int speed);
    void jump(int height);
    boolean fastTravel(String place);
}
