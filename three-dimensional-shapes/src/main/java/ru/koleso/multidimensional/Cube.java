package ru.koleso.multidimensional;

import ru.koleso.GeometricShapes;

public class Cube implements GeometricShapes {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getPerimeter() {
        return 12 * side;
    }
}
