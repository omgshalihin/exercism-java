package org.example.grains;

import java.math.BigInteger;

public class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square >= 65) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return BigInteger.valueOf(2).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }
}
