package com.softunapps.fastsnackapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.softunapps.fastsnack.FastSnack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FastSnack.on(this).message("Hello World!").show();

        FastSnack.on(this).message("Hello World!")
                .textColor(Color.parseColor("#00796B"))
                .textSize(30)
                .textGravity(Gravity.RIGHT)
                .textAlignment(View.TEXT_ALIGNMENT_CENTER)
                .backgroundColor(Color.parseColor("#FF9800"))
                .duration(FastSnack.LENGTH_LONG)
                .setActionTextColor(Color.parseColor("#ccff21"))
                .show();

    }
}
