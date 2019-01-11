package ch.example.chris.wheeloffortune.Processing;

import ch.example.chris.wheeloffortune.Utilities.Constants;
import processing.core.PApplet;
import processing.core.PVector;

public class Lamps extends PApplet {

    private PVector position;

    public Lamps(PVector position){
        this.position = position;
    }


    public void draw(){
        strokeWeight(Constants.DECORATION_LAMP_STROKE_WEIGHT);
        stroke(unhex("FF" + Constants.DECORATION_LAMP_OFF));
        //TODO: not completed yet
        //ellipse(position.x,position.y,);
        //stroke()
        strokeWeight(Constants.DEFAULT_STROKE_WEIGHT);
    }

    public void turnOn(){


    }

    public void turnOff(){

    }






}
