import java.util.ArrayList;

public class RawTypeExample {
    public static void main(String[] args) {
        // Создание ArrayList с "сырым" типом (raw type)
        ArrayList list = new ArrayList();

        // Добавление разных типов объектов в список
        list.add("Пример"); // строка
        list.add(123); // целое число
        list.add(3.14); // число с плавающей точкой

        // Извлечение объектов из списка и вывод их типов
        for (Object obj : list) {
            System.out.println(obj.getClass().getSimpleName());
        }

        // Извлечение элемента без явного приведения типов (не типобезопасно)
        String str = (String) list.get(0);
        System.out.println(str.toUpperCase()); // Вызов метода строки без предварительной проверки типа
    }
}