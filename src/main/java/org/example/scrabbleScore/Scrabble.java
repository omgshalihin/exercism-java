package org.example.scrabbleScore;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    private String word;

//    {65=1, 66=3, 67=3, 68=2, 69=1, 70=4, 71=2, 72=4, 73=1, 74=8, 75=5, 76=1, 77=3, 78=1, 79=1, 80=3, 81=10, 82=1, 83=1, 84=1, 85=1, 86=4, 87=4, 88=8, 89=4, 90=10}
    private static final Map<Integer, Integer> scoresMap = new HashMap<>(26);

    static {
        "AEIOULNRST".chars().forEach(c -> scoresMap.put(c, 1));
        "DG".chars().forEach(c -> scoresMap.put(c, 2));
        "BCMP".chars().forEach(c -> scoresMap.put(c, 3));
        "FHVWY".chars().forEach(c -> scoresMap.put(c, 4));
        "K".chars().forEach(c -> scoresMap.put(c, 5));
        "JX".chars().forEach(c -> scoresMap.put(c, 8));
        "QZ".chars().forEach(c -> scoresMap.put(c, 10));
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        return word.chars().reduce(0, (accum, cur) -> accum + scoresMap.get(cur));
    }
}
