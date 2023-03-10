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
    @Test
    public void reformat_with_leading_and_trailing_white_space() {
        assertEquals(LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"), "Corrupt disk (error)");
    }
    @Test
    public void info_log_level() {
        assertEquals(LogLevels.logLevel("[INFO]: Timezone changed"), "info");
    }
    @Test
    public void error_reformat() {
        assertEquals(LogLevels.reformat("[ERROR]: Segmentation fault"), "Segmentation fault (error)");
    }
    @Test
    public void error_log_level() {
        assertEquals(LogLevels.logLevel("[ERROR]: Disk full"), "error");
    }
    @Test
    public void info_reformat() {
        assertEquals(LogLevels.reformat("[INFO]: Disk defragmented"), "Disk defragmented (info)");
    }
    @Test
    public void warning_reformat() {
        assertEquals(LogLevels.reformat("[WARNING]: Decreased performance"), "Decreased performance (warning)");
    }
    @Test
    public void warning_log_level() {
        assertEquals(LogLevels.logLevel("[WARNING]: Unsafe password"), "warning");
    }

}