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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.String;




public class ResultActivity extends AppCompatActivity {

    //vars
    Animation animScale;
    LinearLayout myResultLayout;
    ImageView koktobeLoading;
    Animation rotation;
    TextView loading;
    TextView resultTextView;
    TextView resultDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.result_text_view);
        resultDescriptionTextView = findViewById(R.id.result_description_text_view);
        myResultLayout = findViewById(R.id.result_linear_layout);
        loading = findViewById(R.id.loading);
        animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        koktobeLoading = findViewById(R.id.koktobeLoading);
        rotation = AnimationUtils.loadAnimation(this, R.anim.rotate);

        Intent intent = getIntent();
        myResultLayout.setVisibility(View.INVISIBLE);

        String personality =  intent.getStringExtra("RESULT_PERSONALITY");
        String personalityDescription =  intent.getStringExtra("RESULT_PERSONALITY_DESCRIPTION");

        resultTextView.setText(personality);
        resultDescriptionTextView.setText(personalityDescription);

        koktobeLoading.startAnimation(rotation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                koktobeLoading.clearAnimation();

                koktobeLoading.setVisibility(ImageView.INVISIBLE);

                loading.setVisibility(View.INVISIBLE);

                myResultLayout.setVisibility(View.VISIBLE);

            }
        }, 5000);

    }

    public void startAgain(View view){

        view.startAnimation(animScale);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);

                startActivity(intent);

            }
        }, 200);

    }
}
