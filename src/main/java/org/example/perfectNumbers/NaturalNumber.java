package org.example.perfectNumbers;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {
    int NUMBER;

    public NaturalNumber(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.NUMBER = i;
    }

    public Classification getClassification() {
        int positiveDivisor = 1;
        List<Integer> aliquotSumArray = new ArrayList<>();

        while (positiveDivisor < NUMBER || positiveDivisor == 1) {
            if (NUMBER % positiveDivisor == 0) {
                aliquotSumArray.add(positiveDivisor);
            }
            positiveDivisor++;
        }

        int aliquotSum = aliquotSumArray.stream().reduce(Integer::sum).get();

        if (aliquotSum == 1) {
            return Classification.DEFICIENT;
        }
        
        if (aliquotSum == NUMBER) {
            return Classification.PERFECT;
        } else if (aliquotSum > NUMBER) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }
}

