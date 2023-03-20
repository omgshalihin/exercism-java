package org.example.isogram;

import java.util.stream.Stream;

public class IsogramChecker {

    public boolean isIsogram(String phrase) {

        int count = (int) Stream.of(phrase.toLowerCase().replace("-", "").replace(" ", "").split(""))
                .distinct()
                .count();

        int phraseCount = phrase.toLowerCase().replace("-", "").replace(" ", "").length();

        return count == phraseCount || phrase.length() == 0;
    }
}
