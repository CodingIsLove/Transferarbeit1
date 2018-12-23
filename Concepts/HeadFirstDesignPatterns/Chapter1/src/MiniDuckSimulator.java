import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;
import FlyClasses.FlyRocketPowered;
import QuackClasses.Quack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("----------------------");

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();

        System.out.println("----------------------");

        // tweak the modelDuck
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new Quack());

        //Print the modified modelDuck
        modelDuck.performQuack();
        modelDuck.performFly();
    }

}
