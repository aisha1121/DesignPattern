package DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

/*
    * You don't know in advance which exact class you need to create
    * Factory decides at runtime which object to instantiate
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape = shapeFactoryObj.getShape("SQUARE");
        shape.draw();
    }
}
