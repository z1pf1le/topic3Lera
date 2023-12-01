package third;

import java.util.*;

public class Winner
{
    public static boolean is(HashMap map) {
        // Пример Map с целочисленными значениями
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put("C", 3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        return false;
    }
}
