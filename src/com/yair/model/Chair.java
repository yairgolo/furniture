package com.yair.model;

public class Chair implements Properties {

    private double length;
    private double width;
    private double height;
    private String color;
    private int numLegs;

    public Chair(double length, double width, double height, String color, int numLegs) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.numLegs = numLegs;
    }

    public Chair() {}
    @Override
    public void draw(){
        System.out.println("  i______i");
        System.out.println("  I______I");
        System.out.println("  I      I");
        System.out.println("  I______I");
        System.out.println(" /      /I");
        System.out.println("(______( I");
        System.out.println("I I    I I");
        System.out.println("I      I");
    }

    @Override
    public String diaplay() {
        return "Chair{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", numLegs=" + numLegs +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
}
