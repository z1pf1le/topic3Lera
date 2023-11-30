package third;

import java.util.*;

public class Winner
{
    public static void main(String[] args) {
        // Пример Map с целочисленными значениями
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);

        // Нахождение ключа с самым большим значением
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        System.out.println("Ключ с самым большим значением: " + maxKey + " (" + maxValue + ")");
    }
}
