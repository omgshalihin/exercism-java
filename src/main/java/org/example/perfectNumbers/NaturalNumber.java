package org.example.perfectNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NaturalNumber {
    int NUMBER;

    public NaturalNumber(int i) {
        System.out.println(i);
        this.NUMBER = i;
    }

    public Classification getClassification() {
        System.out.println(NUMBER);

        int positiveDivisor = 1;
        List<Integer> aliquotSumArray = new ArrayList<>();

        while (positiveDivisor < NUMBER) {
            if (NUMBER % positiveDivisor == 0) {
                aliquotSumArray.add(positiveDivisor);
            }
            positiveDivisor++;
        }

        System.out.println(aliquotSumArray);


        return null;
    }
}

