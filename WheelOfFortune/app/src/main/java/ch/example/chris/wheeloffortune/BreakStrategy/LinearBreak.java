package ch.example.chris.wheeloffortune.BreakStrategy;

public class LinearBreak implements BreakStrategy {

    private boolean breakingDone = false;

    @Override
    public int breakStep(int currentValue) {
        return ++currentValue;
    }

    @Override
    public boolean hasStoped() {
        return false;
    }

}
