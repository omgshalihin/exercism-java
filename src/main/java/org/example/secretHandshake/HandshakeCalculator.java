package org.example.secretHandshake;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {

    static int decimalToBinary(int number) {
        return Integer.parseInt(Integer.toBinaryString(number));
    }

    public List<Signal> getSignal(int number) {

        List<Signal> signalList = new ArrayList<>();

        StringBuilder sb = new StringBuilder(String.valueOf(decimalToBinary(number)));
        String binaryStringReversed = sb.reverse().toString();

        if (binaryStringReversed.charAt(0) == '1') {
            signalList.add(Signal.WINK);
        }

        if (binaryStringReversed.length() >= 2 && binaryStringReversed.charAt(1) == '1') {
            signalList.add(Signal.DOUBLE_BLINK);
        }

        if (binaryStringReversed.length() >= 3 && binaryStringReversed.charAt(2) == '1') {
            signalList.add(Signal.CLOSE_YOUR_EYES);
        }

        if (binaryStringReversed.length() >= 4 && binaryStringReversed.charAt(3) == '1') {
            signalList.add(Signal.JUMP);
        }

        if (binaryStringReversed.length() >= 5 && binaryStringReversed.charAt(4) == '1') {
            Collections.reverse(signalList);
        }

        return signalList;
    }

    List<Signal> calculateHandshake(int number) {
        return getSignal(number);
    }
}
