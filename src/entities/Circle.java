package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Type of: Circle\n");
        string.append(super.toString());
        string.append("\nradius: " + radius);
        string.append("\nArea: " + area());
        return string.toString();
    }
}
