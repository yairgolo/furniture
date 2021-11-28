package com.yair.model;

public class Bed implements Properties {

    private double length;
    private double width;
    private double height;
    private String color;
    private boolean isDouble;

    public Bed(double length, double width, double height, String color, boolean isDouble) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isDouble = isDouble;
    }
    public Bed( ) {}

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

    public boolean isDouble() {
        return isDouble;
    }

    public void setDouble(boolean aDouble) {
        isDouble = aDouble;
    }

    @Override
    public void draw() {
        System.out.println("   ||");
        System.out.println("   ||                   ||");
        System.out.println("||/||___                ||");
        System.out.println("|| /`   )____________||_/|");
        System.out.println("||/___ //_/_/_/_/_/_/||/ |");
        System.out.println("||(___)/_/_/_/_/_/_/_||  |");
        System.out.println("||     |_|_|_|_|_|_|_|| /|");
        System.out.println("||     | | | | | | | ||/||");
        System.out.println("||~~~~~~~~~~~~~~~~~~~||");
        System.out.println("||                   ||");
    }

    @Override
    public String diaplay() {
        return "Bed{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", isDouble=" + isDouble +
                '}';
    }
}
