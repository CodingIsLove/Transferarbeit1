package ch.example.chris.wheeloffortune.BreakStrategy;

public class TikTokBreak implements BreakStrategy {

    @Override
    public int breakStep(int currentValue) {
        return 0;
    }

    @Override
    public boolean hasStoped() {
        return false;
    }
}
