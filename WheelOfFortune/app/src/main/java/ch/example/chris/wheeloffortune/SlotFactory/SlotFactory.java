package ch.example.chris.wheeloffortune.SlotFactory;

import processing.core.PApplet;

public class SlotFactory {

    private PApplet sketch;

    public SlotFactory(PApplet sketch) {
        this.sketch = sketch;
    }

    public Slot getInstance(String type){
        if(type.equalsIgnoreCase("IMAGESLOT")){
            return new ImageSlot(sketch);
        }else if(type.equalsIgnoreCase("TEXTSLOT")){
            return new TextSlot(sketch);
        }else if(type.equalsIgnoreCase("EMPTYSLOT")){
            return new EmptySlot(sketch);
        }
        return null;
    }
}
