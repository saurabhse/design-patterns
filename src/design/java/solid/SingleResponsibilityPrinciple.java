package design.java.solid;

import java.util.ArrayList;
import java.util.List;

/* Let us assume we have different shapes and
 *   we want to calculate area of shapes and
 *   print them*/
public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        List<Shape> shapes = new ArrayList();
        shapes.add(c);
        shapes.add(r);
        AreaCalculator areaCalculator = new AreaCalculator(shapes);
        areaCalculator.calculateSum();
        areaCalculator.printArea();
    }

}
/*interface Shape{

}
class Circle implements Shape{
    private int radius;
}

class Rectangle implements Shape{
    private int radius;
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
}*/
