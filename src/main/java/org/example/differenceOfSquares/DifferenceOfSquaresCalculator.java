package org.example.differenceOfSquares;

import java.util.stream.IntStream;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(IntStream.range(0, input+1).reduce(Integer::sum).getAsInt(), 2);
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(0, input + 1).reduce((prev, curr) -> (int) (prev + Math.pow(curr, 2))).getAsInt();
    }

    public int computeDifferenceOfSquares(int input) {
        System.out.println("in here");
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    public static void main(String[] args) {
        DifferenceOfSquaresCalculator t = new DifferenceOfSquaresCalculator();
        System.out.println(t.computeDifferenceOfSquares(10));
    }
}
