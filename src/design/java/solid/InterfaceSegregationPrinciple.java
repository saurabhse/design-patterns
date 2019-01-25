package design.java.solid;

public class InterfaceSegregationPrinciple {
}

interface ShapeInterface{
    public int area();
    //public int volume(); // wrong to have it here
}

interface SolidShapeInterface{
    public int volume();
}

class Square implements ShapeInterface{
    // Square does not have volume()
    public int area(){
        return 1 ;
    }
}

class Cube implements ShapeInterface,SolidShapeInterface{
    // volume() should be here only
    public int volume(){
        return 1;
    }
    public int area(){
        return 1 ;
    }
}