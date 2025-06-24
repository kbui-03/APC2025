package PresentTasks.Week9;

import java.util.ArrayList;
import java.util.function.*;;

public class MainFood {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        addFood(foods, "Apple", false);
        addFood(foods, "Banana", false);
        addFood(foods, "Rotten Egg", true);

        display(foods);
        clean(foods, food -> food.isFoul());
        System.out.println("After cleaning:");
        display(foods);
        }

    public static void clean (ArrayList<Food> foods, Predicate<Food> condition) {
        foods.removeIf(condition);
    }

    public static void addFood(ArrayList<Food> foods, String type, boolean foul) {
            foods.add(new Food(type, foul));
            System.out.println("Added food: " + type);
        }
    public static void display(ArrayList<Food> foods) {
        foods.forEach(food -> System.out.println("Food: " + food.getType() + ", Foul: " + food.isFoul()));
    }
}
