package ch.example.chris.wheeloffortune.SlotFactory;

import java.io.IOException;

public interface Slot {
    void winningSound() throws IOException;
    void losingSound() throws IOException;
    void showPrice();
    void drawSlot();
    void setPosition(float start, float end);
    void blink();
    boolean isOn();
}
