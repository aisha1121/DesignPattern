package DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

/*
    * You don't know in advance which exact class you need to create
    * Factory decides at runtime which object to instantiate
    * suppose circle class is instantiated in 100 classes on the basis of some logic.
    * Now in future if we want to change the condition on the basis of which circle is selected,
    * then in all 100 classes we need to update the logic. Factory pattern helps here as we can update
    * logic in a single class
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape = shapeFactoryObj.getShape("SQUARE");
        shape.draw();
    }
}
