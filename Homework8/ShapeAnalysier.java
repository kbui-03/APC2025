package Homework8;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ShapeAnalysier {
    
    public static List<? extends Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
        return shapes.stream()
                     .filter(shape -> shape.getArea() >= minArea)
                     .toList();
        }

    public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        return shapes.stream()
                     .max((shape1, shape2) -> Double.compare(shape1.getArea(), shape2.getArea()))
                     .orElse(null);
    }

    public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
        return shapes.stream()
                     .collect(java.util.stream.Collectors.groupingBy(shape -> shape.getClass().getSimpleName()));
    }
}

