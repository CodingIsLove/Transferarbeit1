package ch.example.chris.wheeloffortune.SlotFactory;

import java.util.Arrays;

import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;

public class EmptySlot implements Slot {
    private PApplet sketch;
    private float start = 0 ;
    private float end = Constants.DEFAULT_DEGREE;
    private int[] colorScheme = Constants.COLOR_DEFAULT_EMPTY_SLOT;

    public EmptySlot(PApplet sketch) {
        this.sketch = sketch;
    }

    @Override
    public void toggleLight() {
        if(Arrays.equals(colorScheme,Constants.COLOR_DEFAULT_EMPTY_SLOT)){
            colorScheme = Constants.COLOR_BLINK_EMPTY_SLOT;
        }else{
            colorScheme = Constants.COLOR_DEFAULT_EMPTY_SLOT;
        }
    }

    @Override
    public void winningSound() {

    }

    @Override
    public void losingSound() {

    }

    @Override
    public void showPrice() {

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


    /**
     * This is a Testing Function and will not be used later in this project
     */

}
