package ch.example.chris.wheeloffortune.Processing;

import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;
import processing.core.PImage;

public class Wheel extends PApplet {

    PImage backgroundIm;


    public void settings() {
        size(Constants.DISPLAY_WIDTH, Constants.DISPLAY_HEIGHT);
    }

    public void setup() {
        //TODO: This is not good code, i have to change the path to the default Android ressources
        backgroundIm = loadImage("background_swisscom.jpg");
    }

    public void draw() {

        //Draw Background
        // TODO: background(backgroundIm);

        //background(backgroundIm);

        //Draw Base Ellipse
        fill(255, 255, 255);
        ellipse(width/2,height/2, Constants.WHEEL_SIZE,Constants.WHEEL_SIZE);

        fill(0,0,0);
        ellipse(width/2,height/2, Constants.INNER_WHEEL_SIZE,Constants.INNER_WHEEL_SIZE);


        //Draw Slots


        //Draw CenterPiece
        fill(17, 170, 255);
        ellipse(width/2,height/2,Constants.WHEEL_CENTER_PIECE_SIZE,Constants.WHEEL_CENTER_PIECE_SIZE);

    }
}