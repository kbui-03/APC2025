package PresentTasks.Week7;

public class TransportRobot extends BaseRobot {
    private int runs = 3;
    public TransportRobot(String name) {
        super(name);
    }
    @Override
    public void performTask() {
       try{
           for (int i = 0; i < runs; i++) {
               System.out.println(name + " is transporting items");
               Thread.sleep(1000); // Simulate time taken to transport an item
           }
       } catch (InterruptedException e) {
           System.err.println("An error occurred while performing the task: " + e.getMessage());
       }
       finally {
           stop(); 
       }
    }
}
