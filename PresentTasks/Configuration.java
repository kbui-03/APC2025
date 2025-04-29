package PresentTasks;
import java.util.List;

public class Configuration {
    public static final String appName = "MyApp";
    public static final List <String> modules = List.of("1.0", "2.0", "3.0");

    public static final String describe(){
        return "App Name: " + appName + "\n" +
               "Modules: " + String.join(", ", modules);
    }

    public static void main(String[] args) {
        System.out.println(describe());
    }
}
