package design.java.solid;

import java.util.List;

public class OpenAndClosePrinciple {
    public static void main(String[] args) {

    }
}


/*
interface Shape{
    public int area();
}
class Circle implements Shape{
    private int radius;
    public int area() {
        return 0;
    }
}

class Rectangle implements Shape{
    private int radius;
    public int area() {
        return 0;
    }
}

class AreaCalculator{
    public AreaCalculator(List<Shape> p){

    }
    // below is incorrect as when new shapes are added we need to modify below code
    public int calculateSum_incorrect(List<Shape> p){
        for (Shape shape : p) {
            if (shape instanceof Circle) {

            } else if (shape instanceof Rectangle) {

            }
        }
        return 1;
    }

    // correct implementation as it is open for extension.
    public int calculateSum(List<Shape> p){
        for (Shape shape : p) {
            shape.area();
        }
        return 1;
    }

}*/
