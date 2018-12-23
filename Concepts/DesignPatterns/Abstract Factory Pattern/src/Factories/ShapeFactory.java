package Factories;

import FactoryRessources.Colors.Color;
import FactoryRessources.Shapes.Circle;
import FactoryRessources.Shapes.Rectangle;
import FactoryRessources.Shapes.Shape;
import FactoryRessources.Shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        //null check
        if(shapeType == null){
            return null;
        }

        //return the correct Shape
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    // Color has no functions here, because we wanted a ShapeFactory
    @Override
    Color getColor(String color) {
        return null;
    }
}
