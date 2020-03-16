package com.gamecodeschool.towerdefense;

public abstract class GameObject {
    protected int size;
    private double xlocation;
    private double ylocation;

    public int getSize() {
        return size;
    }

    public void setXlocation(double xlocation) {
        this.xlocation = xlocation;
    }

    public double getXlocation() {
        return xlocation;
    }

    public void setYlocation(double ylocation) {
        this.ylocation = ylocation;
    }

    public double getYlocation() {
        return ylocation;
    }


}
