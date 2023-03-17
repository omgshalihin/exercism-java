package org.example.darts;

import java.util.HashMap;
import java.util.Map;

public class Darts {

//    If the dart lands outside the target, player earns no points (0 points).
//    If the dart lands in the outer circle of the target, player earns 1 point.
//    If the dart lands in the middle circle of the target, player earns 5 points.
//    If the dart lands in the inner circle of the target, player earns 10 points.

//    The outer circle has a radius of 10 units
//    the middle circle a radius of 5 units
//    and the inner circle a radius of 1.

    Map<String, Integer> points = new HashMap<>(Map.of(
            "outer", 1,
            "middle", 5,
            "inner", 10
    ));

    // UNITS
    final int OUTER_R = 10;
    final int MIDDLE_R = 5;
    final int INNER_R = 1;

    int score(double xOfDart, double yOfDart) {
        double[] coordinates = {xOfDart, yOfDart};
        double shortestDistance = Math.sqrt(Math.pow(coordinates[0], 2) + Math.pow(coordinates[1], 2));
        if (shortestDistance <= INNER_R) {
            return points.get("inner");
        }
        if (shortestDistance <= MIDDLE_R) {
            return points.get("middle");
        }
        if (shortestDistance <= OUTER_R) {
            return points.get("outer");
        }
        return 0;
    }
}
