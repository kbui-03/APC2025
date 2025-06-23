package Homework9;

public enum CoursePhase {
    NOT_STARTED ("Course has not started yet."),
    ONGOING ("Course is currently ongoing."),
    FINISHED ("Course has been completed successfully.");

    private String message; 

    CoursePhase (String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

     public static void main(String[] args) {
        for (CoursePhase phase : CoursePhase.values()) {
            System.out.println(phase + ": " + phase.getMessage());
        }
    }
}

