package com.gamecodeschool.towerdefense;

public abstract class Movable extends GameObject {
    private int heading;
    private int speed;

    public Movable(int heading) {
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
    
    public void move() {
        double deltaX = (Math.cos(Math.toRadians(90 - this.getHeading())) * this.getSpeed());
        double deltaY = (Math.sin(Math.toRadians(90 - this.getHeading())) * this.getSpeed());
        this.setXlocation(this.getXlocation() + (float)deltaX);
        this.setYlocation(this.getYlocation() + (float)deltaY);
    }
}
