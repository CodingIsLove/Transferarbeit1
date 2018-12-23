package Factories;

import FactoryRessources.Colors.Color;
import FactoryRessources.Colors.Red;
import FactoryRessources.Colors.Yellow;
import FactoryRessources.Shapes.Shape;

public class ColorFactory extends AbstractFactory {

    //has no implementation, because we wanted a ColorFactory
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String colorType) {

        //null check
        if(colorType == null){
            return  null;
        }

        // return correct Colorinstance
        if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if(colorType.equalsIgnoreCase("GREEN")){
            return  new Red();
        }else if(colorType.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        }
        return null;
    }
}
