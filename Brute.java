package com.gamecodeschool.towerdefense;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Brute {

    public class Hunter extends Movable{
        private Point location = new Point();
        private Bitmap mBitmapBrute;

        public Hunter(Context context, Point sr, int size) {
            super(0);
            this.setSpeed(1);
            this.size = 70;
            this.setHealth(7);
            this.setWeakness("laser");
            location.x = -10;

            mBitmapBrute = BitmapFactory.decodeResource(context.getResources(), R.drawable.brute);
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
            canvas.drawBitmap(mBitmapBrute,location.x*getSize(), location.y*getSize(), paint);
        }
    }
}
