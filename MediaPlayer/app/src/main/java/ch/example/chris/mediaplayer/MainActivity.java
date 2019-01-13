package ch.example.chris.mediaplayer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

import ch.example.chris.mediaplayer.MediaManager.MediaManager;

public class MainActivity extends AppCompatActivity {


    private Button btnBackgroundMusic;
    private Button btnWinningSound;
    private Button btnLostSound;
    private Button btnMute;
    private String TAG ="MainActivity: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the buttons
        btnBackgroundMusic = (Button)findViewById(R.id.btnBackgroundMusic);
        btnWinningSound = (Button)findViewById(R.id.btnWinningSound);
        btnLostSound = (Button)findViewById(R.id.btnLostSound);
        btnMute = (Button)findViewById(R.id.btnMute);

        // Set the click functions on the buttons
        btnBackgroundMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MediaManager.getInstance(getApplicationContext()).playBackgroundMusic();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnWinningSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MediaManager.getInstance(getApplicationContext()).playWinningSound();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnLostSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MediaManager.getInstance(getApplicationContext()).playLostSound();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaManager.getInstance(getApplicationContext()).mute();
            }
        });
    }
}
