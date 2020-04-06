package com.gamecodeschool.towerdefense;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Grunt extends Movable {
    private Point location = new Point();
    private Bitmap mBitmapGrunt;

    public Grunt (Context context, Point sr, int size) {
        super(0);
        this.setSpeed(3);
        this.size = 40;
        this.setHealth(3);
        this.setWeakness("missile");
        location.x = -10;

        mBitmapGrunt =BitmapFactory.decodeResource(context.getResources(), R.drawable.grunt);
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
        canvas.drawBitmap(mBitmapGrunt,location.x*getSize(), location.y*getSize(), paint);
    }
}
