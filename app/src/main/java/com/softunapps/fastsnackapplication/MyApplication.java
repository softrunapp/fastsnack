package com.softunapps.fastsnackapplication;

import android.app.Application;
import android.view.Gravity;
import android.view.View;

import com.softunapps.fastsnack.FastSnack;
import com.softunapps.fastsnack.FastSnackConfigs;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FastSnackConfigs.buildDefaults()
                .setTextColor(getColor(R.color.colorAccent))
                .setTextSize(18)
                .setTextGravity(Gravity.LEFT)
                .setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setBackgroundColor(getColor(R.color.colorPrimaryDark))
                .setDuration(FastSnack.LENGTH_SHORT)
                .setActionTextColor(getColor(R.color.colorAccent));
    }
}
