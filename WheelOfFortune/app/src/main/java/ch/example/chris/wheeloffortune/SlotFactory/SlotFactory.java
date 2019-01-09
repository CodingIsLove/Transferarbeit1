package ch.example.chris.wheeloffortune.SlotFactory;

public class SlotFactory {

    public static Slot getInstance(String type){

        if(type.equalsIgnoreCase("IMAGESLOT")){
            return new ImageSlot();
        }else if(type.equalsIgnoreCase("TEXTSLOT")){
            return new TextSlot();
        }
        return null;
    }
}
