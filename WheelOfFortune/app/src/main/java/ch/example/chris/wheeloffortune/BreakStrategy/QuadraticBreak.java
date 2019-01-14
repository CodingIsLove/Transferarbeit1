package ch.example.chris.wheeloffortune.BreakStrategy;

import ch.example.chris.wheeloffortune.Utilities.Constants;

public class QuadraticBreak implements BreakStrategy {

    @Override
    public int breakStep(int currentValue) {
        return (int)(currentValue*currentValue*Constants.DAMPING_FACTOR + currentValue);
    }

    @Override
    public boolean hasStopped() {
        return false;
    }
}
