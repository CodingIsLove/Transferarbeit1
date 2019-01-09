package ch.example.chris.wheeloffortune.BreakStrategy;

public class LinearBreak implements BreakStrategy {

    // Fixed parameters for this algorithm
    private float breakCoefficient;
    private float startVelocity;
    private float actualVelocity;

    public LinearBreak(){
        this.breakCoefficient = -1;
        this.startVelocity = (float) (Math.random()*20+1);
    }

    @Override
    public float breakStep() {
        // f(x) = b + m*x
        this.actualVelocity = startVelocity - breakCoefficient;  //TODO still not complete

        return 0f;
    }
}
