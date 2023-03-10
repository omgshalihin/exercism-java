package org.example.logLevels;

import java.util.Arrays;

public class LogLevels {

    public static String message(String logLine) {
        String[] logArray = logLine.split(":");
        return logArray[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] logArray = logLine.split(":");
        return logArray[0].substring(1, logArray[0].length()-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}

