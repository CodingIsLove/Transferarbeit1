package ch.example.chris.wheeloffortune;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.aldebaran.qi.sdk.QiContext;
import com.aldebaran.qi.sdk.QiSDK;
import com.aldebaran.qi.sdk.RobotLifecycleCallbacks;
import com.aldebaran.qi.sdk.design.activity.RobotActivity;

import ch.example.chris.wheeloffortune.Processing.Wheel;
import processing.android.CompatUtils;
import processing.android.PFragment;
import processing.core.PApplet;

public class MainActivity extends RobotActivity implements RobotLifecycleCallbacks{

    private PApplet sketch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        QiSDK.register(this,this);

        FrameLayout frame = new FrameLayout(this);
        frame.setId(CompatUtils.getUniqueViewId());
        setContentView(frame, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        sketch = new Wheel();
        PFragment fragment = new PFragment(sketch);
        fragment.setView(frame, this);
    }


    @Override
    protected void onDestroy() {
        QiSDK.unregister(this,this);
        super.onDestroy();
    }

    /*******************************
     *  Pepper Code                *
     ******************************/



    @Override
    public void onRobotFocusGained(QiContext qiContext) {
        //The robot focus is gained
    }

    @Override
    public void onRobotFocusLost() {
        // The robot focus is lost
    }

    @Override
    public void onRobotFocusRefused(String reason) {
        // The robot focus is refused.
    }


    /*******************************
     *  Processing Code            *
     ******************************/
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(sketch != null){
            sketch.onRequestPermissionsResult(requestCode,permissions,grantResults);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        if(sketch != null){
            sketch.onNewIntent(intent);
        }
    }


    /*******************************
     *  Other Methods              *
     ******************************/




}
