package com.gamecodeschool.towerdefense;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class MissileTurret extends Fixed{
    private Point location = new Point();
    private Bitmap mBitmapMissileTurret;
    private String weapon;
    private int cost;
    private int range;

    public MissileTurret (Context context, int xlocation, int ylocation, int size) {
        super(0);
        this.size = 50;
        location.x = xlocation;
        location.y = ylocation;
        this.weapon = "missile";

        mBitmapMissileTurret = BitmapFactory.decodeResource(context.getResources(), R.drawable.missileturret);
    }

    public void spawn(int xlocation, int ylocation) {
        location.x = xlocation;
        location.y = ylocation;
    }

    public void remove() {
        location.x = -10;
        location.y = -10;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(mBitmapMissileTurret,location.x*getSize(), location.y*getSize(), paint);
    }
}
