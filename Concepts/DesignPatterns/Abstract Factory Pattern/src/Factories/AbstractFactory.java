package Factories;

import FactoryRessources.Colors.Color;
import FactoryRessources.Shapes.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
