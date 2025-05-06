package PresentTasks.Week4;

public interface Refuelable {
    void refuel(double liters);
    double getFuelLevel();
    double getRange();

    default boolean canReach(double distance){
        if (this instanceof Vehicle v) return v.getRange() >= distance;
        else return false;
    }
}
