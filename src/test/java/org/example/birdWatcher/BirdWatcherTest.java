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

    @Test
    public void shouldReturn1ForTodayCount() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        birdWatcher = new BirdWatcher(birdsPerDay);
        assertEquals(birdWatcher.getToday(), 1);
    }

    @Test
    public void shouldReturn2ForTodayCountAfterIncrementing() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        birdWatcher = new BirdWatcher(birdsPerDay);
        birdWatcher.incrementTodaysCount();
        assertEquals(birdWatcher.getToday(), 2);
    }

    @Test
    public void itShouldNotHaveDaysWithoutBirds() {
        birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertFalse(birdWatcher.hasDayWithoutBirds());
    }

    @Test
    public void itTestGetCountForFirstDays() {
        assertEquals(birdWatcher.getCountForFirstDays(4), 10);
    }

}