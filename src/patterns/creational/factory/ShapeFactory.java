package patterns.creational.factory;

public class ShapeFactory {

    public static Shape getShape(String shape){
        switch (shape) {
            case "Line":
                return new Line();
            case "Circle":
                return new Circle();
            default: return null;
        }
    }
}
