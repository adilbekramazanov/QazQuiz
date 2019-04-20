package com.example.adilbekramazanov.qazquiz;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.Window;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;


public class HomeActivity extends AppCompatActivity {

    Button startButton;
    LinearLayout myHomeLinearLayout;
    AnimationDrawable animationDrawable;
    Animation animScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        myHomeLinearLayout = findViewById(R.id.home_linear_layout);
        animationDrawable = (AnimationDrawable) myHomeLinearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

        startButton = findViewById(R.id.start_button);
        animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
    }

    public void startQuiz(View view){
        view.startAnimation(animScale);
        Log.i("INFO", String.valueOf(animScale.hasEnded()));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(HomeActivity.this, ChooseTestActivity.class);

                startActivity(intent);

            }
        }, 200);
    }






}
