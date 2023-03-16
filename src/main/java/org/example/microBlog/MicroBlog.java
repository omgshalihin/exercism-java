package org.example.microBlog;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MicroBlog {

    // Any posts of more than 5 chars should be truncated to 5.
    // The task is to truncate input strings to 5 characters.
    public String truncate(String input) {
        return input.length() < 6 ? input : input.substring(0,  input.offsetByCodePoints(0,5));
    }
}
