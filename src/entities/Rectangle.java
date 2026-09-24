package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Type of: Rectangle\n");
        string.append(super.toString());
        string.append("\nwidth: " + width);
        string.append("\nheight: " + height);
        string.append("\nArea: " + area());
        return string.toString();
    }
}
