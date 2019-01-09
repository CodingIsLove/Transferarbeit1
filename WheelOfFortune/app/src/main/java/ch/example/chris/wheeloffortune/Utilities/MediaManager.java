package ch.example.chris.wheeloffortune.Utilities;

import android.media.MediaPlayer;

public class MediaManager {

    /**
     * Membervariables
     */
    // TODO: Check out if i would not rather use the sound manager
    private MediaPlayer mediaPlayer = new MediaPlayer();


    /**
     * Singleton Design Pattern
     */
    private static MediaManager instance = new MediaManager();

    private MediaManager(){}

    public static MediaManager getInstance(){
        return instance;
    }

    /**
     * Methods
     */

    //TODO: Implementation von Soundmethoden => Gewonnen verloren etc.



}
