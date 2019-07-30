package com.softunapps.fastsnack;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

public class FastSnack {
    public static final int LENGTH_SHORT = -1;
    public static final int LENGTH_LONG = 0;

    private Context mContext;
    private View mView;
    private String mMessage, mActionText;
    private int mDuration;
    private int mBackgroundColor, mTextColor, mTextGravity, mTextSize, mTextAlignment,
            mActionTextColor;
    private View.OnClickListener mActionListener;

    public FastSnack() {
        initDefaultConfigs();
    }

    private void initDefaultConfigs() {
        FastSnackConfigs fastSnackConfigs = new FastSnackConfigs();
        mDuration = fastSnackConfigs.getDuration();
        mBackgroundColor = fastSnackConfigs.getBackgroundColor();
        mTextColor = fastSnackConfigs.getTextColor();
        mActionTextColor = fastSnackConfigs.getActionTextColor();
        mTextGravity = fastSnackConfigs.getTextGravity();
        mTextAlignment = fastSnackConfigs.getTextAlignment();
        mTextSize = fastSnackConfigs.getTextSize();
    }

    private FastSnack setView(Context context, int viewId) {
        this.mContext = context;
        this.mView = ((Activity) mContext).findViewById(viewId);
        return this;
    }

    private FastSnack setView(View view) {
        this.mView = view;
        return setContext(view);
    }

    private FastSnack setContext(View view) {
        if (this.mContext == null)
            this.mContext = view.getContext();
        return this;
    }


    public static FastSnack on(View view) {
        return new FastSnack().setView(view);
    }

    public static FastSnack on(Context context, int viewId) {
        return new FastSnack().setView(context, viewId);
    }

    public FastSnack message(String message) {
        this.mMessage = message;
        return this;
    }

    public FastSnack duration(int duration) {
        if (duration != LENGTH_LONG && duration != LENGTH_SHORT) {
            duration = LENGTH_SHORT;
        }
        this.mDuration = duration;
        return this;
    }

    public FastSnack textGravity(int textGravity) {
        this.mTextGravity = textGravity;
        return this;
    }

    public FastSnack textSize(int textSize) {
        this.mTextSize = textSize;
        return this;
    }

    public FastSnack textColor(@ColorInt int textColor) {
        this.mTextColor = textColor;
        return this;
    }

    public FastSnack textAlignment(int textAlignment) {
        this.mTextAlignment = textAlignment;
        return this;
    }


    public void show() {
        if (mContext == null) {
            throw new NullPointerException(
                    "Attempt to invoke virtual value context on a null object reference");
        }
        if (mView == null) {
            throw new NullPointerException(
                    "Attempt to invoke virtual value view on a null object reference");
        }
        if (mMessage == null) {
            throw new NullPointerException(
                    "Attempt to invoke virtual value message on a null object reference");
        }

        Snackbar snackbar = Snackbar.make(mView, mMessage, mDuration);
        snackbar.getView().setBackgroundColor(mBackgroundColor);
        TextView tv = (snackbar.getView().findViewById(android.support.design.R.id.snackbar_text));
        tv.setTextColor(mTextColor);
        tv.setGravity(mTextGravity);
        tv.setTextSize(mTextSize);
        tv.setTextAlignment(mTextAlignment);
        if (mActionText != null) {
            snackbar.setAction(mActionText, mActionListener);
            snackbar.setActionTextColor(mActionTextColor);
        }
        snackbar.show();
    }


    public FastSnack setActionListener(String actionText, View.OnClickListener actionListener) {
        this.mActionText = actionText;
        this.mActionListener = actionListener;
        return this;
    }

    public FastSnack setActionTextColor(@ColorInt int actionTextColor) {
        this.mActionTextColor = actionTextColor;
        return this;
    }
}
