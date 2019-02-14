package com.example.nzheng2.rxgydemo;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class CircularTextView extends TextView {
    private float strokeWidth;
    int strokeColor, solidColor;
    private Paint strokePaint;
    private Paint circlePaint;

    public CircularTextView(Context context) {
        super(context);
        init();
    }

    public CircularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CircularTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        circlePaint = new Paint();
        circlePaint.setFlags(Paint.ANTI_ALIAS_FLAG);

        strokePaint = new Paint();
        strokePaint.setFlags(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    public void draw(Canvas canvas) {
        circlePaint.setColor(solidColor);
        strokePaint.setColor(strokeColor);


        int h = this.getHeight();
        int w = this.getWidth();

        int diameter = ((h > w) ? h : w);
        int radius = diameter / 2;

        this.setHeight(diameter);
        this.setWidth(diameter);

        canvas.drawCircle(diameter / 2, diameter / 2, radius, strokePaint);

        canvas.drawCircle(diameter / 2, diameter / 2, radius - strokeWidth, circlePaint);

        super.draw(canvas);
    }

    public void setStrokeWidth(int dp) {
        float scale = getContext().getResources().getDisplayMetrics().density;
        strokeWidth = dp * scale;

    }

    public void setStrokeColor(String color) {
        strokeColor = Color.parseColor(color);
//        invalidate();
    }

    public void setSolidColor(String color) {
        solidColor = Color.parseColor(color);
//        invalidate();
    }
}