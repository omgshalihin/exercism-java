package org.example.darts;

import java.util.Arrays;
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
            "outside", 0,
            "outer", 1,
            "middle", 5,
            "inner", 10
    ));
    int score(double xOfDart, double yOfDart) {
        double [] coordinates = {xOfDart, yOfDart};
        if (coordinates[0] > 5.0 && coordinates[1] > 5.0) {
            return points.get("outside");
        } else {
            return 10;
        }
    }
}
