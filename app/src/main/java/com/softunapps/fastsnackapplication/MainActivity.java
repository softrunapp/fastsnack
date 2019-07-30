package com.softunapps.fastsnackapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softunapps.fastsnack.FastSnack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FastSnack.on(findViewById(R.id.root)).message("Hello World!").backgroundColor(getColor(R.color.colorAccent)).show();

    }
}
