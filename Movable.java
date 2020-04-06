package com.gamecodeschool.towerdefense;

import android.graphics.Point;

public abstract class Movable extends GameObject {
    private Point location = new Point();
    private int heading;
    private int speed;
    private int health;
    private String weakness;
    private boolean isDead;

    public Movable(int heading) {
        this.heading = heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getHeading() {
        return heading;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void changeHeading() {
        if (this instanceof ISteerable) {
            this.heading = heading;
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setWeakness(String weak) {
        this.weakness = weak;
    }

    public boolean getDeath() {
        return isDead;
    }

    public void setDeath(boolean death) {
        this.isDead = death;
    }


    public void move() {
        double deltaX = (Math.cos(Math.toRadians(90 - this.getHeading())) * this.getSpeed());
        double deltaY = (Math.sin(Math.toRadians(90 - this.getHeading())) * this.getSpeed());
        location.x = (location.x + (int)deltaX);
        location.y = (location.y + (int)deltaY);
    }
}
