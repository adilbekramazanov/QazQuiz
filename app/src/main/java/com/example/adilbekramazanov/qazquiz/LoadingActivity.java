package com.example.adilbekramazanov.qazquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;



public class LoadingActivity extends  AppCompatActivity{
    ImageView koktobeLoading;
    Animation rotation;



    class C02031 extends TimerTask {


        public void run() {
            LoadingActivity.this.startActivity(new Intent(LoadingActivity.this, ResultActivity.class));
        }
    }

    protected void onCreate(@Nullable Bundle bundle) {

        super.onCreate(bundle);
        setContentView(R.layout.activity_quiz);
        koktobeLoading = findViewById(R.id.koktobeLoading);
        rotation = AnimationUtils.loadAnimation(LoadingActivity.this, R.anim.rotate);

//

        new Timer().schedule(new C02031(), 5000);
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}