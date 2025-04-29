package PresentTasks;
import java.util.List;

public class CustomConfiguration extends Configuration {
    // Override the appName and modules fields
    public static final String appName = "CustomApp";
    public static final List<String> modules = List.of("4.0", "5.0", "6.0");

    /* Override the describe method won't work, since final methods cannot be overridden
    public static String describe2() {
        return "Custom App Name: " + appName + "\n" +
               "Custom Modules: " + String.join(", ", modules);
    }
    */

    public static void main(String[] args) {
        // Call the describe method from the parent class
        System.out.println(describe());
        
        // Call the overridden describe method
        System.out.println("Custom App Name: " + appName + "\n" +
                           "Custom Modules: " + String.join(", ", modules));
    }
}