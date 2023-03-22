package org.example.resistorColorDuo;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResistorColorDuo {

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

    public int value(String[] colors) {
        String sb = String.valueOf(handleColorMap().get(colors[0])) +
                handleColorMap().get(colors[1]);
        return Integer.parseInt(sb);
    }
}
