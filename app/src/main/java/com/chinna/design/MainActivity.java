package com.chinna.design;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout1, constraintLayout2;
    Button first_butn, second_butn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout1 = findViewById(R.id.first_screen);
        constraintLayout2 = findViewById(R.id.second_screen);
        first_butn = findViewById(R.id.next);
        second_butn = findViewById(R.id.previous);
        final Animation previousAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.previous);
        final Animation nextAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.next);
        first_butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout2.setVisibility(View.VISIBLE);
                constraintLayout1.setVisibility(View.GONE);
                constraintLayout2.startAnimation(previousAnim);
            }
        });
        second_butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout1.setVisibility(View.VISIBLE);
                constraintLayout2.setVisibility(View.GONE);
                constraintLayout1.startAnimation(nextAnim);
            }
        });
    }
}
