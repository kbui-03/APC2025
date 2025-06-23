package Homework9;

public class Student {
    private String name;
    private int year;
    private String major;

    public Student(String name, int year, String major) {
        this.name = name;
        this.year = year;
        this.major = major;
    }
    
    public static void main(String[] args) {
        Student student = new Student("Alice", 2, "Computer Science");
        StudentFormatter simpleFormatter = s -> 
            "Name: " + s.name + ", Year: " + s.year;
        StudentFormatter detailedFormatter = s ->
            "Name: " + s.name + ", Year: " + s.year + ", Major: " + s.major;

        System.out.println(simpleFormatter.formatStudent(student));
        System.out.println(detailedFormatter.formatStudent(student));

    }
}
