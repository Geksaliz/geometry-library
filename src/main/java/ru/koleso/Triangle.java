package ru.koleso;

public class Triangle implements GeometricShapes {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(
                semiPerimeter *
                        (semiPerimeter - sideA) *
                        (semiPerimeter - sideB) *
                        (semiPerimeter - sideC)
        );
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
