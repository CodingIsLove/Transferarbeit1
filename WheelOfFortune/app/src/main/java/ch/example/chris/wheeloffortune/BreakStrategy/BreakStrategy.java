package ch.example.chris.wheeloffortune.BreakStrategy;

public interface BreakStrategy {
    int breakStep(int currentValue);
    boolean hasStopped();
}
