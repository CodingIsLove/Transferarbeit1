package ch.example.chris.wheeloffortune.SlotFactory;

import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;

public class ImageSlot implements Slot {


    private PApplet sketch;
    private float start = 0 ;
    private float end = Constants.DEFAULT_DEGREE;

    public ImageSlot(PApplet sketch) {
        this.sketch = sketch;
    }

    @Override
    public void toggleLight() {

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
        sketch.fill(Constants.COLOR_DEFAULT_IMAGE_SLOT[0],Constants.COLOR_DEFAULT_IMAGE_SLOT[1],Constants.COLOR_DEFAULT_IMAGE_SLOT[2]);
        sketch.arc(Constants.ARC_X_COORDINATE,Constants.ARC_Y_COORINATE,Constants.ARC_DIAMETER,Constants.ARC_DIAMETER,start,end, sketch.PIE);
    }


    public void setPosition(float start, float end){
        this.start = start;
        this.end = end;
    }
}
