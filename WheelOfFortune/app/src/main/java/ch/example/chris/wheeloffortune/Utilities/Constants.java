package ch.example.chris.wheeloffortune.Utilities;

public class Constants {
    /*********************
     *  Numerical Values *
     ********************/
    // Pepper
   public static final int DISPLAY_WIDTH = 1280;
   public static final int DISPLAY_HEIGHT = 800;

   // Wheel of fortune
   public static final int QR_CODE_SIZE = 350;
   public static final int WHEEL_SIZE = 750;
   public static final int INNER_WHEEL_SIZE =700;
   public static final int WHEEL_CENTER_PIECE_SIZE = 120;
   public static final int WHEEL_BORDER = 4;
   public static final int DEFAULT_STROKE_WEIGHT = 1;
   public static final int DECORATION_LAMP_STROKE_WEIGHT = 2;
   public static final int DECORATION_LAMP_DIAMETER = 30;

   // Slots
    public static final int ARC_X_COORDINATE = DISPLAY_WIDTH/2;
    public static final int ARC_Y_COORINATE = DISPLAY_HEIGHT/2;
    public static final int ARC_DIAMETER = INNER_WHEEL_SIZE;
    public static final float DEFAULT_DEGREE = (float)Math.PI/6;
    public static final float ROTATION_CORRECTION = (float)Math.PI/18;
    public static final int RADIUS_IMAGE = 250;
    public static final int DEFAULT_TEXT_SIZE = 40;
    public static final int RADIUS_TEXT = 300;

    // Setup variables
    public static final int DEFAULT_FRAME_RATE = 1;
    public static final int DEFAULT_DELAY_FACTOR = 5;


    /*********************
     *  String Values    *
     ********************/
    // Environment Constants
     static final String QR_CODE_IMAGE_BASE_PATH = "./app/src/main/java/ch/example/chris/wheeloffortune/QRCodesTmp/";

     // Wheel Constants
    public static final String BACKGROUND_IMAGE_PATH = ".app/src/main/res/drawable/background_swisscom.jpg";
    public static final String DECORATION_LAMP_OFF = "EF9B0F";
    public static final String DECORATION_LAMP_ON = "FFFF00";

    /*********************
     *  Color Arrays     *
     ********************/
    public static final int[] COLOR_DEFAULT_EMPTY_SLOT = {16,69,139};  //Swisscom dark blue
    public static final int [] COLOR_BLINK_EMPTY_SLOT = {17,170,255};
    public static final int[] COLOR_DEFAULT_TEXT_SLOT ={221,17,34};  //Swisscom red
    public static final int[] COLOR_BLINK_TEXT_SLOT={16,69,139};
    public static final int[] COLOR_DEFAULT_IMAGE_SLOT={187,187,187}; //Swisscom gray
    public static final int[] COLOR_BLINK_IMAGE_SLOT={16,69,139};
}
