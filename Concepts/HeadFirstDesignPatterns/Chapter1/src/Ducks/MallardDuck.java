package Ducks;

import FlyClasses.FlyWithWings;
import QuackClasses.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a real Mallard duck");
    }

}
