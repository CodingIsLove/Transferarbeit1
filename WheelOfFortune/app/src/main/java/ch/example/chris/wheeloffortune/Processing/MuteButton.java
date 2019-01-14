package ch.example.chris.wheeloffortune.Processing;

import processing.core.PApplet;
import processing.core.PImage;

public class MuteButton {

    private int x;
    private int y;
    private int width;
    private int height;
    private PImage image;
    private PApplet sketch;

    public MuteButton(PApplet sketch, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }



    public void drawBtn(){

        if(image == null){
            sketch.ellipse(x,y,width,height);
        }else{
            sketch.image(image,x,y);
        }
    }


}
