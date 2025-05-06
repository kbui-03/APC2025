package PresentTasks.Week4;

public abstract class Vehicle {
    private String id;
    private double maxLoad;

    public Vehicle(String id, double maxLoad) {
        this.id = id;
        this.maxLoad = maxLoad;
    }
    
    public abstract double getRange (); //km
    public abstract double fuelNeeded(double distance);
    
}
