package adresCheloveka;

import java.util.*;
public class FindElderOrYounger {

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
}
