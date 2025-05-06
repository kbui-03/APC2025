package PresentTasks.Week4;

public class EVan extends Vehicle implements Electrified{
    private double ElectricityLevel;

    public EVan(String id, double maxLoad, double ElectricityLevel) {
            super(id, maxLoad);
            this.ElectricityLevel = ElectricityLevel;
            
        }
    @Override
    public void charge(double kWh) {
        ElectricityLevel += kWh;
    }

    @Override
    public double getBatteryLevel() {
        return ElectricityLevel;
    }

    @Override
    public double getRange() {
       return ElectricityLevel * 0.25;
    }

    @Override
    public double fuelNeeded(double distance) {
       return distance * 0.25;
    } 

}