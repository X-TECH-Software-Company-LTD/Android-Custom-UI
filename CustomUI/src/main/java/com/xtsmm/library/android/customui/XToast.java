package com.xtsmm.library.android.customui;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.card.MaterialCardView;

public class XToast {

    Activity activity;
    View layout;

    public XToast(Activity activity) {
        this.activity = activity;
    }

    public void craete() {
        LayoutInflater inflater = activity.getLayoutInflater();
        layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) activity.findViewById(R.id.toast_layout_root));
    }

    public void setText(String text){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setText(text);
    }

    public void setTextSize(int size){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTextSize(size);
    }

    public void setTextColor(String colorCode){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTextColor(Color.parseColor(colorCode));
    }

    public void setTextColor(int color){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTextColor(color);
    }

    public void setTextFontFromAssetAndStyle(String assetFontPath,int style){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        textView.setTypeface(font,style);
    }
    public void setTextFontAndStyle(int fonts,int style){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = ResourcesCompat.getFont(activity,fonts);
        textView.setTypeface(font,style);
    }

    public void setTextFontFromAsset(String assetFontPath){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        textView.setTypeface(font);
    }

    public void setTextFont(int fonts){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        Typeface font = ResourcesCompat.getFont(activity,fonts);
        textView.setTypeface(font);
    }

    public void setTextStyle(int style){
        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setTypeface(null,style);
    }

    public void setIconResource(int resID){
        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setVisibility(View.VISIBLE);
        image.setImageResource(resID);
    }

    public void setPadding(int left,int top,int right,int bottom){
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_layout_root);
        linearLayout.setPadding(left,top,right,bottom);
    }

    public void setCornerRadius(float radius){
        MaterialCardView cardView=(MaterialCardView) layout.findViewById(R.id.toast_cardView);
        cardView.setRadius(radius);

    }

    public void setStrokeWidth(int strokeWidth){
        MaterialCardView cardView=(MaterialCardView) layout.findViewById(R.id.toast_cardView);
        cardView.setStrokeWidth(strokeWidth);

    }

    public void setStrokeColor(String colorCode){
        MaterialCardView cardView=(MaterialCardView) layout.findViewById(R.id.toast_cardView);
        cardView.setStrokeColor(Color.parseColor(colorCode));
    }

    public void setStrokeColor(int color){
        MaterialCardView cardView=(MaterialCardView) layout.findViewById(R.id.toast_cardView);
        cardView.setStrokeColor(color);
    }

    public void setBackgroundColor(String colorCode){
        MaterialCardView cardView=(MaterialCardView) layout.findViewById(R.id.toast_cardView);
        cardView.setCardBackgroundColor(Color.parseColor(colorCode));
    }

    public void setBackgroundColor(int color){
        MaterialCardView cardView=(MaterialCardView) layout.findViewById(R.id.toast_cardView);
        cardView.setCardBackgroundColor(color);
    }


    public void show(){

        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int phoneHeight = displayMetrics.heightPixels;

        Toast toast = new Toast(activity);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, phoneHeight / 3);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public void show(int gravity,int xOffset,int yOffset,int duration){

        Toast toast = new Toast(activity);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }

    public void show(int duration){

        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int phoneHeight = displayMetrics.heightPixels;

        Toast toast = new Toast(activity);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, phoneHeight / 3);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
}
