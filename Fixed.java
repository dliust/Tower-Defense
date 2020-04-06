package com.gamecodeschool.towerdefense;

import android.graphics.Point;

public abstract class Fixed extends GameObject{
    private Point point = new Point();
    private int heading;

    public Fixed(int heading) {
        this.heading = heading;
    }

}
