package ru.koleso.impl;

import ru.koleso.GeometricShapes;

public class Circle implements GeometricShapes {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
