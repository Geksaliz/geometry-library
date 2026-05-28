package ru.koleso.multidimensional;

import ru.koleso.GeometricShapes;

public class Sphere implements GeometricShapes {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Как такового периметра не существует, считает периметр окружности
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}