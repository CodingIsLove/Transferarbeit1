package ch.example.chris.wheeloffortune.BreakStrategy;

public class LinearBreak implements BreakStrategy {

    private boolean breakingDone = false;

    @Override
    public int breakStep(int currentValue) {
        return currentValue+3;
    }

    @Override
    public boolean hasStopped() {
        return false;
    }

}
