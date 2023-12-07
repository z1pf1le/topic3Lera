package adresCheloveka;

import java.util.*;
public class FindElderOrYounger {
    public static int findMaxFieldValue;

    // Метод для поиска объекта с наибольшим значением N
    public static int findMaxNObject(List<Human> objects) {
        for (Human obj : objects) {
            int maxAge = 0;
            if(obj.getBirthDate() > maxAge) {
                maxAge = obj.getBirthDate();
            }
            return maxAge;
        }
        return 0;
    }

    // Метод для поиска объекта с наименьшим значением N
    public static int findMinNObject(List<Human> objects) {
        for (Human obj : objects) {
            int minAge = 0;
            if(obj.getBirthDate() < minAge) {
                minAge = obj.getBirthDate();
                System.out.println(obj.getBirthDate());
            }
            return minAge;
        }
        return 0;
    }

    public static int findMaxFieldValue(ArrayList<Human> list) {
        int maxField = list.get(0).getBirthDate(); // предположим, что getFieldValue() возвращает значение поля объекта
        for (Human obj : list) {
            if (obj.getBirthDate() > maxField) { // здесь getFieldValue() - это метод, возвращающий значение поля объекта
                maxField = obj.getBirthDate();
            }
        }
        return maxField;
    }
}
