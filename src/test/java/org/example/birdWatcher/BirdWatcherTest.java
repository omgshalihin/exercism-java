package org.example.birdWatcher;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BirdWatcherTest {

    BirdWatcher birdWatcher = new BirdWatcher(new int[]{0, 2, 5, 3, 7, 8, 4});

    @Test
    public void getLastWeekData() {
        assertArrayEquals(birdWatcher.getLastWeek(), new int[]{0, 2, 5, 3, 7, 8, 4});
    }

    @Test
    public void itShouldNotHaveBusyDays() {
        birdWatcher = new BirdWatcher(new int[] { 1, 2, 3, 3, 2, 1, 4 });
        assertEquals(birdWatcher.getBusyDays(), 0);
    }

}