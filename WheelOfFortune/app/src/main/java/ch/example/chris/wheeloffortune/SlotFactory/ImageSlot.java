package ch.example.chris.wheeloffortune.SlotFactory;
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
    private int[] colorScheme;
    private boolean isOn;

    public ImageSlot(PApplet sketch) {
        this.sketch = sketch;
        //this.winIcon = sketch.loadImage("swisscom_circular_center.png");  //TODO: delete me if solution for image found
        this.colorScheme=Constants.COLOR_DEFAULT_IMAGE_SLOT;
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
    public void drawSlot() {
        //Basic setup
        sketch.stroke(Constants.DECORATION_LAMP_STROKE_WEIGHT);
        sketch.fill(colorScheme[0],colorScheme[1],colorScheme[2]);
        sketch.arc(Constants.ARC_X_COORDINATE,Constants.ARC_Y_COORINATE,Constants.ARC_DIAMETER,Constants.ARC_DIAMETER,start,end, sketch.PIE);

        // Position Text
        sketch.pushMatrix();
        // Basic rotation operation to project images
        sketch.translate(sketch.width/2,sketch.height/2);
        sketch.rotate(start +Constants.ROTATION_CORRECTION + Constants.COORDINATE_MATCHING_CONSTANT);
        sketch.translate(0,Constants.RADIUS_TEXT);
        sketch.rotate(-sketch.PI/2);

        //TODO: paint image here
        //sketch.image(winIcon,0,0);
        sketch.textSize(Constants.DEFAULT_TEXT_SIZE);
        sketch.fill(255);
        sketch.text("IMAGE",0,0);

        sketch.popMatrix();
    }

    public void setPosition(float start, float end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void blink() {
        if(colorScheme == Constants.COLOR_DEFAULT_IMAGE_SLOT){
            this.colorScheme = Constants.COLOR_BLINK_IMAGE_SLOT;
            this.isOn = true;
        }else{
            this.colorScheme = Constants.COLOR_DEFAULT_IMAGE_SLOT;
            this.isOn = false;
        }
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    public void setImage(PImage image){
        this.winIcon = image;
    }
}
