package PresentTasks.Week4;

public interface Electrified {
    double MAX_BATTERY_KWH = 120;
    void charge (double kWh);
    double getBatteryLevel();
}
