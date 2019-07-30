package com.softunapps.fastsnack;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.view.Gravity;
import android.view.View;

public class FastSnackConfigs {
    private static int DURATION, BACKGROUND_COLOR, TEXT_COLOR, TEXT_GRAVITY, TEXT_SIZE,
            TEXT_ALIGNMENT, ACTION_TEXT_COLOR;
    
    public FastSnackConfigs() {
    }

    public static FastSnackConfigs buildDefaults(){
        DURATION = FastSnack.LENGTH_LONG;
        BACKGROUND_COLOR = Color.parseColor("#00796B");
        TEXT_COLOR = Color.parseColor("#FFFFFF");
        TEXT_GRAVITY = Gravity.CENTER;
        TEXT_SIZE = 12;
        TEXT_ALIGNMENT = View.TEXT_ALIGNMENT_CENTER;
        ACTION_TEXT_COLOR = Color.parseColor("#FFC107");
        return new FastSnackConfigs();
    }

    public FastSnackConfigs setDuration(int duration) {
        DURATION = duration;
        return this;
    }

    public FastSnackConfigs setBackgroundColor(@ColorInt int backgroundColor) {
        BACKGROUND_COLOR = backgroundColor;
        return this;
    }

    public FastSnackConfigs setTextColor(@ColorInt int textColor) {
        TEXT_COLOR = textColor;
        return this;
    }

    public FastSnackConfigs setTextGravity(int textGravity) {
        TEXT_GRAVITY = textGravity;
        return this;
    }

    public FastSnackConfigs setTextAlignment(int textAlignment) {
        TEXT_ALIGNMENT = textAlignment;
        return this;
    }

    public FastSnackConfigs setTextSize(int textSize) {
        TEXT_SIZE = textSize;
        return this;
    }

    public FastSnackConfigs setActionTextColor(@ColorInt int actionTextColor) {
        ACTION_TEXT_COLOR = actionTextColor;
        return this;
    }

    public int getDuration() {
        return DURATION;
    }

    public int getBackgroundColor() {
        return BACKGROUND_COLOR;
    }

    public int getTextColor() {
        return TEXT_COLOR;
    }

    public int getTextGravity() {
        return TEXT_GRAVITY;
    }

    public int getTextSize() {
        return TEXT_SIZE;
    }

    public int getTextAlignment() {
        return TEXT_ALIGNMENT;
    }

    public int getActionTextColor() {
        return ACTION_TEXT_COLOR;
    }
}
