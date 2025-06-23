package Homework8;

public class ShapeFactory {
    public static Shape fromString(String input){
        String[] parts = input.split(",");
        String shapeType = parts[0].trim().toLowerCase();
        
        switch (shapeType) {
            case "circle":
                double radius = Double.parseDouble(parts[1].trim());
                return new Circle(radius);
            case "rectangle":
                double length = Double.parseDouble(parts[1].trim());
                double width = Double.parseDouble(parts[2].trim());
                return new Rectangle(length, width);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
