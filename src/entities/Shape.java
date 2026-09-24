package entities;

import entities.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Color: " + this.color);
        return string.toString();
    }
}
