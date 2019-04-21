package com.example.adilbekramazanov.qazquiz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class ChooseTestActivity extends AppCompatActivity {

    Animation animScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_choose_test);

        animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
    }

    public void startPersonalityQuiz(View view){

        view.startAnimation(animScale);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(ChooseTestActivity.this, PersonalityQuizActivity.class);

                startActivity(intent);

            }
        }, 200);

    }

    public void startFoodQuiz(View view){

        view.startAnimation(animScale);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(ChooseTestActivity.this, FoodQuizActivity.class);

                startActivity(intent);

            }
        }, 200);

    }
}
