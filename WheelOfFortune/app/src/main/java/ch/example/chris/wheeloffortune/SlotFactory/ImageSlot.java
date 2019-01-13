package ch.example.chris.wheeloffortune.SlotFactory;

import android.content.Context;

import java.io.IOException;

import ch.example.chris.wheeloffortune.MediaManager.MediaManager;
import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;
import processing.core.PImage;

public class ImageSlot implements Slot {


    private PApplet sketch;
    private PImage winIcon;
    private float start = 0 ;
    private float end = Constants.DEFAULT_DEGREE;
    private Context context;

    public ImageSlot(PApplet sketch, Context context) {
        this.sketch = sketch;
        this.context =context;
    }

    @Override
    public void toggleLight() {

    }

    @Override
    public void winningSound() throws IOException {
        MediaManager.getInstance(context).playWinningSound();
    }

    @Override
    public void losingSound() throws IOException {
        MediaManager.getInstance(context).playLostSound();
    }

    @Override
    public void showPrice() {

    }


    @Override
    public void drawSlot() {
        // Draw basic arc layer
        sketch.stroke(Constants.DECORATION_LAMP_STROKE_WEIGHT);
        sketch.fill(Constants.COLOR_DEFAULT_IMAGE_SLOT[0],Constants.COLOR_DEFAULT_IMAGE_SLOT[1],Constants.COLOR_DEFAULT_IMAGE_SLOT[2]);
        sketch.arc(Constants.ARC_X_COORDINATE,Constants.ARC_Y_COORINATE,Constants.ARC_DIAMETER,Constants.ARC_DIAMETER,start,end, sketch.PIE);
    }

    public void setPosition(float start, float end){
        this.start = start;
        this.end = end;
    }

    public void setImage(PImage image){
        this.winIcon = image;
    }
}
