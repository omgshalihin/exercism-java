package org.example.logLevels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogLevelsTest {

    @Test
    void testLogLevel () {
        String message1 = "[ERROR]: Invalid operation";
        String message2 = "[WARNING]:  Disk almost full\r\n";
        assertEquals(LogLevels.message(message1), "Invalid operation");
        assertEquals(LogLevels.message(message2), "Disk almost full");
    }

}