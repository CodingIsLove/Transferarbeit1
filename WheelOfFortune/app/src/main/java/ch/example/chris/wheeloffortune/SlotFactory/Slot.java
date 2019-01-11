package ch.example.chris.wheeloffortune.SlotFactory;

public interface Slot {
    void toggleLight();
    void winningSound();
    void losingSound();
    void showPrice();
    void drawSlot();
    void setPosition(float start, float end);
}
