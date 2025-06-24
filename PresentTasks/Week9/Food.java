package PresentTasks.Week9;

public class Food {
    private String type;
    private boolean foul; 

    public Food(String type, boolean foul) {
        this.type = type;
        this.foul = foul;
    }
    public String getType() {
        return type;
    }
    public boolean isFoul() {
        return foul;
    }
}
