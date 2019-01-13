package ch.example.chris.wheeloffortune.SlotFactory;

import android.content.Context;

import processing.core.PApplet;

public class SlotFactory {

    private PApplet sketch;
    private Context context;

    public SlotFactory(PApplet sketch,Context context) {
        this.sketch = sketch;
        this.context=context;
    }

    public Slot getInstance(String type){
        if(type.equalsIgnoreCase("IMAGESLOT")){
            return new ImageSlot(sketch,context);
        }else if(type.equalsIgnoreCase("TEXTSLOT")){
            return new TextSlot(sketch,context);
        }else if(type.equalsIgnoreCase("EMPTYSLOT")){
            return new EmptySlot(sketch,context);
        }
        return null;
    }
}
