package com.softunapps.fastsnackapplication;

import android.app.Application;

import com.softunapps.fastsnack.FastSnackConfigs;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FastSnackConfigs.buildDefaults()
                .setBackgroundColor(getColor(R.color.colorPrimaryDark));
    }
}
