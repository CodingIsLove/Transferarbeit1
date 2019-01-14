package ch.example.chris.wheeloffortune.MediaManager;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;

import ch.example.chris.wheeloffortune.R;


public class MediaManager {
    private static MediaManager ourInstance;
    private Context context;
    private MediaPlayer winMedia;
    private MediaPlayer loseMedia;
    private MediaPlayer backgroundMusic;

    public static MediaManager getInstance(Context context) {
        if(ourInstance == null){
            ourInstance = new MediaManager(context);
        }
        return ourInstance;
    }

    private MediaManager(Context context) {
        this.context = context;

        //Create all the Mediaplayer
        winMedia = MediaPlayer.create(context,R.raw.smb_stage_clear);
        loseMedia = MediaPlayer.create(context,R.raw.smb_gameover);
        backgroundMusic = MediaPlayer.create(context,R.raw.mario_theme);
    }

    public void playWinningSound() throws IOException {

        if(!winMedia.isPlaying()){
            winMedia.stop();
            winMedia.prepare();
        }
        //Play Win
        winMedia.seekTo(0);
        winMedia.start();

    }

    public void playBackgroundMusic() throws IOException {
        if(!backgroundMusic.isPlaying()){
            backgroundMusic.stop();
            backgroundMusic.prepare();
        }
        backgroundMusic.seekTo(0);
        backgroundMusic.start();
        backgroundMusic.setLooping(true);
    }

    public void playLostSound() throws IOException {
        if(!loseMedia.isPlaying()){
            loseMedia.stop();
            loseMedia.prepare();
        }
        loseMedia.seekTo(0);
        loseMedia.start();
    }

    public void mute(){
        winMedia.stop();
        loseMedia.stop();
        backgroundMusic.stop();
    }
}
