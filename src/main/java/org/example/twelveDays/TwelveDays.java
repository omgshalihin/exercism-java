package org.example.twelveDays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwelveDays {

    private static final Map<Integer, String> numbersMap = new HashMap<>(Map.ofEntries(
            Map.entry(1, "first"),
            Map.entry(2, "second"),
            Map.entry(3, "third"),
            Map.entry(4, "fourth"),
            Map.entry(5, "fifth"),
            Map.entry(6, "sixth"),
            Map.entry(7, "seventh"),
            Map.entry(8, "eighth"),
            Map.entry(9, "ninth"),
            Map.entry(10, "tenth"),
            Map.entry(11, "eleventh"),
            Map.entry(12, "twelfth")
    ));

    private static final String lyrics = "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, a Partridge in a Pear Tree";


    String verse(int verseNumber) {
        String[] lyricsArray = lyrics.split(",\\s");

        StringBuilder sb = new StringBuilder();

        String[] result = Arrays.copyOfRange(lyricsArray, lyricsArray.length - verseNumber, lyricsArray.length);

        if (result.length > 1) {
            result[result.length - 1] = "and " + result[result.length - 1];
        }
        for (var a : result) {
            sb.append(a).append(", ");
        }

        sb.replace(sb.length() - 2, sb.length(), ".\n");

        return String.format("On the %s day of Christmas my true love gave to me: %s", numbersMap.get(verseNumber), sb);
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {


            sb.append(verse(i));

            if (i != endVerse) {
                sb.append("\n");
            }

        }
        return sb.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}