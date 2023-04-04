package org.example.triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

class Triangle {

    double SIDE1 = 0.0;
    double SIDE2 = 0.0;
    double SIDE3 = 0.0;
    List<Double> triangle;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.SIDE1 = side1;
        this.SIDE2 = side2;
        this.SIDE3 = side3;
        List<Double> sidesList = new ArrayList<>(List.of(SIDE1, SIDE2, SIDE3));
        System.out.println(sidesList);
        if (sidesList.stream().anyMatch(side -> side == 0.0)) {
            throw new TriangleException();
        }
        triangle = Optional.of(asList(side1, side2, side3))
                .filter( legalTriangle )
                .orElseThrow(() -> new TriangleException());
    }

    boolean isEquilateral() {
        List<Double> sidesList = new ArrayList<>(List.of(SIDE1, SIDE2, SIDE3));
        if (sidesList.stream().distinct().toList().size() == 3) {
            return false;
        }
        return ((SIDE1 + SIDE2 + SIDE3) / 3) == SIDE1;
    }

    boolean isIsosceles() {
        if (isEquilateral()) {
            return true;
        }
        List<Double> sidesList = new ArrayList<>(List.of(SIDE1, SIDE2, SIDE3));
        return sidesList.stream().distinct().toList().size() == 2;
    }

    boolean isScalene() {
        List<Double> sidesList = new ArrayList<>(List.of(SIDE1, SIDE2, SIDE3));
        return sidesList.stream().distinct().toList().size() == 3;
    }

    private static final Predicate<List<Double>> legalTriangle = l -> {
        double sum = l.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        return l.stream()
                .allMatch(side ->
                        (sum - side > side) && (side > 0));
    };
}
