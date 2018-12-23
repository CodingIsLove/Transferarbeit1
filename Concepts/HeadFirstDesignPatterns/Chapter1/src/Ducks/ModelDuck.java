package Ducks;

import FlyClasses.FlyWithWings;
import QuackClasses.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
