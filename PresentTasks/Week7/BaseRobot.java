package PresentTasks.Week7;

public abstract class BaseRobot implements ControllableRobot {
    protected String name;
    protected boolean running;

    public BaseRobot(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        running = true;
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println(name + " is stopping.");
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    public abstract void performTask();
    
}