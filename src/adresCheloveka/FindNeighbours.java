package adresCheloveka;

import java.util.ArrayList;

public class FindNeighbours{
    public static ArrayList<Human> findObjectsWithSameN(ArrayList<Human> list) {
        ArrayList<Human> result = new ArrayList<>();
        if (list.isEmpty()) {
            return result;
        }

        // найдем значение поля N у первого объекта в списке
        Adress nValue = list.get(0).getAdress(); // предположим, что getN() возвращает значение поля N

        // проходим по списку и добавляем объекты с равным значением поля N в результирующий список
        for (Human obj : list) {
            if (obj.getAdress() == nValue) {
                result.add(obj);
            }
        }
        return result;
    }
}
