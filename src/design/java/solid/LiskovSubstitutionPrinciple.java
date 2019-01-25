package design.java.solid;


import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        List<ShapeCharacteristics> shapes = new ArrayList();
        shapes.add(c);
        shapes.add(r);

        for (ShapeCharacteristics shape : shapes) {
            shape.isShapeRound();
        }
    }
}


interface Shape{
    public int area();


}

class ShapeCharacteristics {
    public void isShapeRound(){}
    public void isDrawable(){}
}
class Circle extends ShapeCharacteristics implements Shape {
    private int radius;

    public void isShapeRound() {
        System.out.println("Round");
    }
    public int area() {
        return 0;
    }
}

class Rectangle extends ShapeCharacteristics implements Shape{
    private int radius;
    public int area() {
        return 0;
    }
}

class AreaCalculator{
    public AreaCalculator(List<Shape> p){

    }
    public int calculateSum(){
        return 1;
    }

    // bad way. this should be in separate class AreaOutputter
    public void printArea(){
        System.out.println("Area is : ");
    }
}