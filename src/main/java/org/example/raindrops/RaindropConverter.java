package org.example.raindrops;

public class RaindropConverter {

//    convert a number into a string that contains raindrop sounds.
//    The rules of raindrops are that if a given number:
//    has 3 as a factor, add 'Pling' to the result.
//    has 5 as a factor, add 'Plang' to the result.
//    has 7 as a factor, add 'Plong' to the result.
//    does not have any of 3, 5, or 7 as a factor, the result should be the digits of the number.

    String convert(int number) {

        StringBuilder sb = new StringBuilder();

        if (number % 3 == 0) {
            sb.append("Pling");
        }
        if (number % 5 == 0) {
            sb.append("Plang");
        }
        if (number % 7 == 0) {
            sb.append("Plong");
        }
        return sb.isEmpty() ? String.valueOf(number) : sb.toString();
    }
}
