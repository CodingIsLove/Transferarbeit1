package ch.example.chris.wheeloffortune.SlotFactory;
import android.content.Context;

import java.io.IOException;

import ch.example.chris.wheeloffortune.MediaManager.MediaManager;
import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;



public class TextSlot implements Slot {

    private PApplet sketch;
    private String content;
    private float start = 0 ;
    private float end = Constants.DEFAULT_DEGREE;
    private Context context;


    public TextSlot(PApplet sketch, Context context) {
        this.sketch = sketch;
        //TODO: add the text variable
        this.context = context;
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
        //Basic setup
        sketch.stroke(Constants.DECORATION_LAMP_STROKE_WEIGHT);
        sketch.fill(Constants.COLOR_DEFAULT_TEXT_SLOT[0],Constants.COLOR_DEFAULT_TEXT_SLOT[1],Constants.COLOR_DEFAULT_TEXT_SLOT[2]);
        sketch.arc(Constants.ARC_X_COORDINATE,Constants.ARC_Y_COORINATE,Constants.ARC_DIAMETER,Constants.ARC_DIAMETER,start,end, sketch.PIE);

        // Position Text
        sketch.pushMatrix();
        // Basic rotation operation to project images
        sketch.translate(sketch.width/2,sketch.height/2);
        sketch.rotate(start - 2*Constants.ROTATION_CORRECTION);
        sketch.translate(0,Constants.RADIUS_TEXT);
        sketch.fill(204, 102, 0);  //TODO: Remove the magic numbers
        //sketch.rect(0,0,40,40);
        sketch.rotate(-sketch.PI/2);
        sketch.textSize(Constants.DEFAULT_TEXT_SIZE);
        sketch.fill(255);
        sketch.text("Winner",0,0);
        sketch.popMatrix();
    }


    public void setPosition(float start, float end){
        this.start = start;
        this.end = end;
    }

}
