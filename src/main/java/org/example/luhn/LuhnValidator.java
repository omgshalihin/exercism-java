package org.example.luhn;

import java.util.ArrayList;
import java.util.List;

public class LuhnValidator {

    boolean isValid(String candidate) {

        String candidateWithoutSpaces = candidate.replaceAll("\\s", "");

        boolean containsNonDigit = candidateWithoutSpaces.replaceAll("[0-9]", "").length() > 0;

        if (candidateWithoutSpaces.length() <= 1) {
            return false;
        }
        if (containsNonDigit) {
            return false;
        }

        StringBuilder sb = new StringBuilder(candidateWithoutSpaces);
        sb.reverse();
        String[] candidateArray = sb.toString().split("");


        List<String> toDouble = new ArrayList<>();
        List<String> nonDouble = new ArrayList<>();
        List<String> resultOfDoubling = new ArrayList<>();

        for (int i = 0; i < candidateWithoutSpaces.length(); i++) {
            if (i % 2 != 0) {
                toDouble.add(candidateArray[i]);
            } else {
                nonDouble.add(candidateArray[i]);
            }
        }

        toDouble.forEach(i -> {
            int doubleNumber = Integer.parseInt(i) * 2;
            if (doubleNumber > 9) {
                resultOfDoubling.add(String.valueOf(doubleNumber - 9));
            } else {
                resultOfDoubling.add(String.valueOf(doubleNumber));
            }
        });

        int sumResultOfDoubling = 0;
        int sumNonDouble = 0;

        for (var number : resultOfDoubling) {
            sumResultOfDoubling += Integer.parseInt(number);
        }
        for (var number : nonDouble) {
            sumNonDouble += Integer.parseInt(number);
        }

        int sumOfAllDigits = sumResultOfDoubling + sumNonDouble;

        return sumOfAllDigits % 10 == 0;
    }
}
