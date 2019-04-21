package com.example.adilbekramazanov.qazquiz;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    ImageView splashImageLogo;
    Animation fadeIn;
    Animation animScale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        splashImageLogo = findViewById(R.id.splash_image_logo);

        animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        splashImageLogo.startAnimation(fadeIn);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashImageLogo.startAnimation(fadeIn);
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
                finish();

            }
        }, 4 * 1000);

    }
}
