package ru.koleso.utils;

import ru.koleso.GeometricShapes;

public class GeometryUtils {
    public static double centimetersToMeters(double cm) {
        return cm / 100;
    }

    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static boolean haveEqualArea(
            GeometricShapes shape1,
            GeometricShapes shape2
    ) {
        return shape1.getArea() == shape2.getArea();
    }

    public static GeometricShapes getLargerShape(
            GeometricShapes shape1,
            GeometricShapes shape2
    ) {

        if (shape1.getArea() > shape2.getArea()) {
            return shape1;
        }

        return shape2;
    }
}
