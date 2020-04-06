package com.gamecodeschool.towerdefense;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Base extends Fixed {
    private Point location = new Point();
    private Bitmap mBitmapBase;
    private int health;
    private boolean isDead;

    public Base (Context context, int xlocation, int ylocation, int size) {
        super(0);
        this.size = 100;
        location.x = xlocation;
        location.y = ylocation;

        mBitmapBase = BitmapFactory.decodeResource(context.getResources(), R.drawable.base);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setDead(boolean dead) {
        this.isDead = dead;
    }

    public boolean getDead() {
        return isDead;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(mBitmapBase,location.x*getSize(), location.y*getSize(), paint);
    }
}
