package org.example.birdWatcher;

import java.util.Arrays;

public class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        System.out.println(Arrays.toString(birdsPerDay));
        return birdsPerDay;
    }

    public int getToday() {
        int today = birdsPerDay.length - 1;
        return birdsPerDay[today];
    }

    public void incrementTodaysCount() {
        int today = birdsPerDay.length - 1;
        birdsPerDay[today] ++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay)
                .anyMatch(count -> count < 1);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int actualLength = birdsPerDay.length;
        if (actualLength < numberOfDays) {
            for (int i = 0; i < actualLength; i++) {
                System.out.println(birdsPerDay[i]);
                sum += birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                System.out.println(birdsPerDay[i]);
                sum += birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay)
                .filter(count -> count >= 5)
                .count();
    }
}
