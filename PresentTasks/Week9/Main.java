package PresentTasks.Week9;

public class Main {
    public static void main(String[] args) {
        Circle diamater = radius -> radius < 0 ? 0 : 2 * radius;
        Circle circumference = radius -> radius < 0 ? 0 : 2 * Math.PI * radius;
        Circle surface = radius -> radius < 0 ? 0 : Math.PI * radius * radius;

        System.out.println("Diameter: " + diamater.calculate(5));
        System.out.println("Circumference: " + circumference.calculate(5));
        System.out.println("Surface: " + surface.calculate(-2));
    }
}
