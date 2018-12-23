public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else{
            return null;
        }
    }
}
