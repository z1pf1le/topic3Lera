package kosti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindMostFrequentElement {

    public static String findMostFrequentElement(ArrayList<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        String mostFrequentElement = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        return mostFrequentElement;
    }
}
