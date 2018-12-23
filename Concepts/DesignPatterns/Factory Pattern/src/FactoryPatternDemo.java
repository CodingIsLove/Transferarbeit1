public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");

        // Test the draw functions of those shapes
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
