package PresentTasks.Week7;

public class Main {
    public static void main(String[] args) {
        ControllableRobot transportRobot = new TransportRobot("Transporter");
        transportRobot.start();
        if (transportRobot.isRunning()) {
            transportRobot.performTask();
        }
        System.out.println("Is the robot running? " + transportRobot.isRunning());
    }
}