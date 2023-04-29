package org.example.luhn;

public class LuhnValidator {

    boolean isValid(String candidate) {
        System.out.println(candidate);
        if (candidate.length() <= 1) {
            return false;
        }
        return true;
    }
}
