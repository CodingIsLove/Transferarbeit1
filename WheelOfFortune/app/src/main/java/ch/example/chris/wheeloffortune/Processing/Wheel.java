package ch.example.chris.wheeloffortune.Processing;

import android.os.Environment;

import ch.example.chris.wheeloffortune.SlotFactory.EmptySlot;
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
    private int currentPosition = 9;



    public Wheel(){
        this.slotFactory = new SlotFactory(this);
        this.slotArray = new Slot[12];

        // Fill up the Array
        for(int i = 0; i < 12; i++){
            slotArray[i] = slotFactory.getInstance("EMPTYSLOT");
            slotArray[i].setPosition(i*Constants.DEFAULT_DEGREE,(i+1)*Constants.DEFAULT_DEGREE);
        }

    }


    public void settings() {
        size(Constants.DISPLAY_WIDTH, Constants.DISPLAY_HEIGHT);
    }

    public void setup() {
        //TODO: This is not good code, i have to change the path to the default Android ressources
        backgroundIm = loadImage("background_swisscom.jpg");
        centerPiece = loadImage("swisscom_circular_center.png");
        frameRate = Constants.DEFAULT_FRAME_RATE;
    }

    public void draw() {

        //Draw Background
        background(backgroundIm);

        //Draw Base Ellipse
        strokeWeight(Constants.WHEEL_BORDER);
        fill(255, 255, 255);
        ellipse(width/2,height/2, Constants.WHEEL_SIZE,Constants.WHEEL_SIZE);
        strokeWeight(Constants.DEFAULT_STROKE_WEIGHT);


        // Draw all the Slots
        for(int i = 0; i < 12; i++){
            slotArray[i].drawSlot();
        }


        //Draw Slots

        //TODO: write a Loop to draw the circle Sections


        //Draw CenterPiece
        image(centerPiece,width/2-60,height/2-60,Constants.WHEEL_CENTER_PIECE_SIZE,Constants.WHEEL_CENTER_PIECE_SIZE);

        //Make next step
        if(delay == 0){
            delay = Constants.DEFAULT_DELAY_FACTOR;
            nextStep();
        }else{
            delay--;
        }
    }



    public void nextStep(){
        slotArray[currentPosition].blink();
        currentPosition = (currentPosition + 1)%12;
    }
}