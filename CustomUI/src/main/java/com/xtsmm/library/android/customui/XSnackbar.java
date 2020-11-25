package com.xtsmm.library.android.customui;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class XSnackbar {

    Activity activity;
    View layout;
    Snackbar.SnackbarLayout snackbarLayout;
    Snackbar snackbar;
    View parentLayout;
    setOnClickListener CallBack;

    public XSnackbar(Activity activity) {
        this.activity = activity;
    }

    public void craete() {
        LayoutInflater inflater = activity.getLayoutInflater();
        layout = inflater.inflate(R.layout.custom_snackar,
                null);


    }

    public void setText(String text) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setText(text);
    }

    public void setTextSize(int size) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTextSize(size);
    }

    public void setTextColor(String colorCode) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTextColor(Color.parseColor(colorCode));
    }

    public void setTextColor(int color) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTextColor(color);
    }

    public void setTextFontFromAssetAndStyle(String assetFontPath, int style) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        textView.setTypeface(font, style);
    }

    public void setTextFontAndStyle(int fonts, int style) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = ResourcesCompat.getFont(activity, fonts);
        textView.setTypeface(font, style);
    }

    public void setTextFontFromAsset(String assetFontPath) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        textView.setTypeface(font);
    }

    public void setTextFont(int fonts) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = ResourcesCompat.getFont(activity, fonts);
        textView.setTypeface(font);
    }

    public void setTextStyle(int style) {
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTypeface(null, style);
    }

    public void setIconResource(int resID) {
        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setVisibility(View.VISIBLE);
        image.setImageResource(resID);
    }

    public void setPadding(int left, int top, int right, int bottom) {
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_layout_root);
        linearLayout.setPadding(left, top, right, bottom);
    }

    public void setCornerRadius(float radius) {
        MaterialCardView cardView = (MaterialCardView) layout.findViewById(R.id.snackbar_cardView);
        cardView.setRadius(radius);

    }

    public void setStrokeWidth(int strokeWidth) {
        MaterialCardView cardView = (MaterialCardView) layout.findViewById(R.id.snackbar_cardView);
        cardView.setStrokeWidth(strokeWidth);

    }

    public void setStrokeColor(String colorCode) {
        MaterialCardView cardView = (MaterialCardView) layout.findViewById(R.id.snackbar_cardView);
        cardView.setStrokeColor(Color.parseColor(colorCode));
    }

    public void setStrokeColor(int color) {
        MaterialCardView cardView = (MaterialCardView) layout.findViewById(R.id.snackbar_cardView);
        cardView.setStrokeColor(color);
    }

    public void setBackgroundColor(String colorCode) {
        MaterialCardView cardView = (MaterialCardView) layout.findViewById(R.id.snackbar_cardView);
        cardView.setCardBackgroundColor(Color.parseColor(colorCode));
    }
    public void setBackgroundColor(int color) {
        MaterialCardView cardView = (MaterialCardView) layout.findViewById(R.id.snackbar_cardView);
        cardView.setCardBackgroundColor(color);
    }

    public void setSnackbarPadding(int left,int top,int right,int bottom){
        snackbarLayout.setPadding(10, 10, 10, 10);
    }

    public void setActionButton(setOnClickListener mCallBack){
        CallBack = mCallBack;
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setVisibility(View.VISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallBack.onClick(v);
            }
        });

    }

    public void setActionButtonBackgroundColor(String colorCode){
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setBackgroundColor(Color.parseColor(colorCode));
        if(colorCode.equals("#00000000")){
            button.setRippleColor(ColorStateList.valueOf(Color.TRANSPARENT));
        }
    }

    public void setActionButtonBackgroundColor(int color){
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setBackgroundColor(color);
        if(color==Color.TRANSPARENT) {
            button.setRippleColor(ColorStateList.valueOf(Color.TRANSPARENT));
        }
    }

    public void setActionButtonText(String text){
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setText(text);
    }

    public void setActionButtonTextColor(String colorCode){
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setTextColor(Color.parseColor(colorCode));
    }

    public void setActionButtonTextColor(int color){
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setTextColor(color);
    }

    public void setActionButtonTextSize(int size) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setTextSize(size);
    }

    public void setActionButtonTextFontFromAssetAndStyle(String assetFontPath, int style) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        button.setTypeface(font, style);
    }

    public void setActionButtonTextFontAndStyle(int fonts, int style) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        Typeface font = ResourcesCompat.getFont(activity, fonts);
        button.setTypeface(font, style);
    }

    public void setActionButtonTextFontFromAsset(String assetFontPath) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        button.setTypeface(font);
    }

    public void setActionButtonTextFont(int fonts) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        Typeface font = ResourcesCompat.getFont(activity, fonts);
        button.setTypeface(font);
    }

    public void setActionButtonTextStyle(int style) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setTypeface(null, style);
    }

    public void setActionButtonBackground(Drawable drawable) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setBackground(drawable);
    }

    public void setActionButtonBackgroundResource(int backgroundResID) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setBackgroundResource(backgroundResID);
    }

    public void setActionButtonRippleColor(String colorCode) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setRippleColor(ColorStateList.valueOf(Color.parseColor(colorCode)));
    }

    public void setActionButtonRippleColor(ColorStateList colorStateList) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setRippleColor(colorStateList);
    }

    public void setActionButtonRippleColorResource(int color) {
        MaterialButton button=(MaterialButton)layout.findViewById(R.id.snackbar_btn);
        button.setRippleColorResource(color);
    }

    public void show() {

            // Add the view to the Snackbar's layout
            parentLayout = activity.findViewById(android.R.id.content);
            snackbar = Snackbar.make(parentLayout, "", Snackbar.LENGTH_SHORT);
            // Get the Snackbar's layout view
            snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
            // Hide the text
            TextView textView = (TextView) snackbarLayout.findViewById(com.google.android.material.R.id.snackbar_text);
            textView.setVisibility(View.INVISIBLE);
            snackbarLayout.addView(layout,0);
            snackbarLayout.setBackgroundColor(Color.TRANSPARENT);
            // Show the Snackbar
            snackbar.show();

    }
    public void show(int duration) {

        // Add the view to the Snackbar's layout
        parentLayout = activity.findViewById(android.R.id.content);
        snackbar = Snackbar.make(parentLayout, "", duration);
        // Get the Snackbar's layout view
        snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        // Hide the text
        TextView textView = (TextView) snackbarLayout.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setVisibility(View.INVISIBLE);
        snackbarLayout.addView(layout,0);
        snackbarLayout.setBackgroundColor(Color.TRANSPARENT);
        // Show the Snackbar
        snackbar.show();

    }
    public void dismiss() {
        snackbar.dismiss();
    }

    public interface setOnClickListener {
        public void onClick(View view);
    }
}
