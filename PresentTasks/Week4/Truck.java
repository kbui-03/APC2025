package PresentTasks.Week4;

public class Truck extends Vehicle implements Refuelable{
    private double fuelLevel; 

    public Truck(String id, double maxLoad, double fuelLevel) {
        super(id, maxLoad);
        this.fuelLevel = fuelLevel;
    }
    @Override
    public void refuel(double liters) {
        this.fuelLevel += liters;
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public double getRange() {
       return getFuelLevel()*0.3;
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance*0.3;
    }
    
}
