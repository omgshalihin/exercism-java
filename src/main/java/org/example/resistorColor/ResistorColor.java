package org.example.resistorColor;

import java.util.*;

public class ResistorColor {

    public Map<String, Integer> handleColorMap () {

        Map<String, Integer> colorMap = new LinkedHashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);

        return colorMap;
    }

    public int colorCode(String color) {
        return handleColorMap().get(color.toLowerCase());
    }

    public String[] colors() {
        return handleColorMap().keySet().toArray(new String[0]);
    }
}
