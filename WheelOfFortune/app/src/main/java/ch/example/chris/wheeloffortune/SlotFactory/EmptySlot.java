package ch.example.chris.wheeloffortune.SlotFactory;

import java.io.IOException;
import java.util.Arrays;

import ch.example.chris.wheeloffortune.MediaManager.MediaManager;
import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;

public class EmptySlot implements Slot {
    private PApplet sketch;
    private float start = 0 ;
    private float end = Constants.DEFAULT_DEGREE;
    private int[] colorScheme = Constants.COLOR_DEFAULT_EMPTY_SLOT;
    private boolean isOn = false;

    public EmptySlot(PApplet sketch) {
        this.sketch = sketch;
    }


    @Override
    public void winningSound() throws IOException {
        MediaManager.getInstance(sketch.getContext()).playWinningSound();
    }

    @Override
    public void losingSound() throws IOException {
        MediaManager.getInstance(sketch.getContext()).playLostSound();
    }

    @Override
    public void showPrice() {

    }

    @Override
    public boolean isPrice() {
        return false;
    }

    @Override
    public void drawSlot() {
        sketch.stroke(Constants.DECORATION_LAMP_STROKE_WEIGHT);
        sketch.fill(colorScheme[0],colorScheme[1],colorScheme[2]);
        sketch.arc(Constants.ARC_X_COORDINATE,Constants.ARC_Y_COORINATE,Constants.ARC_DIAMETER,Constants.ARC_DIAMETER,start,end, sketch.PIE);
    }


    public void setPosition(float start, float end){
            this.start = start;
            this.end = end;
    }

    @Override
    public void blink() {
        if(colorScheme == Constants.COLOR_DEFAULT_EMPTY_SLOT){
            this.colorScheme = Constants.COLOR_BLINK_EMPTY_SLOT;
            this.isOn = true;
        }else{
            this.colorScheme = Constants.COLOR_DEFAULT_EMPTY_SLOT;
            this.isOn = false;
        }
    }

    @Override
    public boolean isOn() {
        return isOn;
    }


}
