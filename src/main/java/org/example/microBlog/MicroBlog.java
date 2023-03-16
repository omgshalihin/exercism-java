package org.example.microBlog;

public class MicroBlog {

    // Any posts of more than 5 chars should be truncated to 5.
    // The task is to truncate input strings to 5 characters.
    public String truncate(String input) {
        int sizeOfInput = input.length();
        if (sizeOfInput <= 5) {
            return input;
        }
        return input.substring(0, 5);
    }
}
