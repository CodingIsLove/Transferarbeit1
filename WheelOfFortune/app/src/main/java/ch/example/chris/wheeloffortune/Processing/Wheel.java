package ch.example.chris.wheeloffortune.Processing;

import android.content.Context;
import android.os.Environment;

import java.io.IOException;

import ch.example.chris.wheeloffortune.MediaManager.MediaManager;
import ch.example.chris.wheeloffortune.SlotFactory.Slot;
import ch.example.chris.wheeloffortune.SlotFactory.SlotFactory;
import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;
import processing.core.PImage;

public class Wheel extends PApplet {

    private PImage backgroundIm;
    private PImage centerPiece;
    private SlotFactory slotFactory;
    private int delay = Constants.DEFAULT_DELAY_FACTOR;
    private Slot[] slotArray;
    private Context context;
    private int currentPosition;
    private int counter;


    public Wheel(Context context) throws IOException {
        this.slotFactory = new SlotFactory(this);
        this.slotArray = new Slot[12];
        this.context = context;
        this.currentPosition=0;
        this.counter = 0;

        // Fill up the Array
        boolean flagOn = true;
        for(int i = 0; i < 12; i++){
            if(i % 2 == 0){
                if(flagOn){
                    slotArray[i] = slotFactory.getInstance("TEXTSLOT");
                    slotArray[i].setPosition(i*Constants.DEFAULT_DEGREE,(i+1)*Constants.DEFAULT_DEGREE);
                }else{
                    slotArray[i] = slotFactory.getInstance("IMAGESLOT");
                    slotArray[i].setPosition(i*Constants.DEFAULT_DEGREE,(i+1)*Constants.DEFAULT_DEGREE);
                }
                flagOn= !flagOn;

            } else{
                slotArray[i] = slotFactory.getInstance("EMPTYSLOT");
                slotArray[i].setPosition(i*Constants.DEFAULT_DEGREE,(i+1)*Constants.DEFAULT_DEGREE);
            }
        }
        //MediaManager.getInstance(context).playBackgroundMusic();   //TODO: uncommment to release sound bibliothek
        System.out.println("Wheel:: The sketchpath is: " + sketchPath);
    }


    public void settings() {
        size(Constants.DISPLAY_WIDTH, Constants.DISPLAY_HEIGHT);
    }

    public void setup() {
        //TODO: This is not good code, i have to change the path to the default Android ressources
        backgroundIm = loadImage("background_swisscom.jpg");
        centerPiece = loadImage("swisscom_circular_center.png");
        frameRate = Constants.DEFAULT_FRAME_RATE;
        smooth(8);  // This will make anti-aliasing
    }

    public void draw() {


        /*******************
         * Draw the wheel  *
         *******************/
        //Draw Background
        background(backgroundIm);

        //Draw Base Ellipse
        strokeWeight(Constants.WHEEL_BORDER);
        fill(255, 255, 255);
        ellipse(width/2,height/2, Constants.WHEEL_SIZE,Constants.WHEEL_SIZE);
        strokeWeight(Constants.DEFAULT_STROKE_WEIGHT);

        //TODO: write a Loop to draw the circle Sections
        // Draw all the Slots
        for(int i = 0; i < 12; i++){
            slotArray[i].drawSlot();
        }


        //Draw CenterPiece
        image(centerPiece,width/2-60,height/2-60,Constants.WHEEL_CENTER_PIECE_SIZE,Constants.WHEEL_CENTER_PIECE_SIZE);


        /********************************
         * Handle Blinking and methods  *
         ********************************/
        if(counter == Constants.DEFAULT_DELAY_FACTOR){
            nextStep();
            counter = 0;
        }else{
            counter++;
        }

        clear();
    }

    @Override
    public void touchStarted() {
        super.touchStarted();
        MediaManager.getInstance(getContext()).mute();
    }


    //TODO: This needs to run! We will find a solution for this!

    public void nextStep(){

        for(Slot slot : slotArray){
            if(slot.isOn()){
                slot.blink();
            }
        }
        slotArray[currentPosition].blink();
        currentPosition = (currentPosition + 1)%12;
    }
}