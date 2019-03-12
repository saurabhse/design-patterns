package patterns.creational.factory;

public class Client {
    public static void main(String[] args) {
        Shape line = ShapeFactory.getShape("Line");
        if(line != null) {
            line.draw();
        }

        Shape circle = ShapeFactory.getShape("Circle");
        if(circle != null) {
            circle.draw();
        }
    }
}
