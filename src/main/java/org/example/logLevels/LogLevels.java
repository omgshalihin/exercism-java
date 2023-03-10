package org.example.logLevels;

import java.util.Arrays;

public class LogLevels {

    public static String message(String logLine) {
        String[] a = logLine.split(":");
        return a[1].trim();
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}

