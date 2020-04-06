package com.gamecodeschool.towerdefense;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Hunter extends Movable{
    private Point location = new Point();
    private Bitmap mBitmapHunter;

    public Hunter(Context context, Point sr, int size) {
        super(0);
        this.setSpeed(2);
        this.size = 50;
        this.setHealth(4);
        this.setWeakness("gun");
        location.x = -10;

        mBitmapHunter =BitmapFactory.decodeResource(context.getResources(), R.drawable.hunter);
    }

    public void spawn(int xlocation, int ylocation) {
        location.x = xlocation;
        location.y = ylocation;
    }

    public void remove() {
        location.x = -10;
        location.y = -10;
    }

    public void damage() {
        this.setHealth(this.getHealth() - 1);
    }

    public void weaknessDamage() {
        this.setHealth(this.getHealth() - 3);
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(mBitmapHunter,location.x*getSize(), location.y*getSize(), paint);
    }
}
