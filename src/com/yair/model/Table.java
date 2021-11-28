package com.yair.model;

public class Table implements Properties{

    private double length;
    private double width;
    private double height;
    private String color;
    private int numLegs;

    public Table(double length, double width, double height, String color, int numLegs) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.numLegs = numLegs;
    }
    public Table( ) {}
    @Override
    public void draw(){
        System.out.println("   =====================");
        System.out.println("  /                   /");
        System.out.println(" /                   /|");
        System.out.println("===================== |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");

    }

    @Override
    public String diaplay() {
        return "Table{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", numLegs=" + numLegs +
                '}';
    }
}
