package playground;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InstanceInput {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = System.in;
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Запрашиваем у пользователя количество экземпляров класса
        System.out.println("Введите количество экземпляров класса, которые вы хотите создать:");
        int count = scanner.nextInt();

        // Создаем массив для хранения чисел, введенных для каждого экземпляра
//        int[] numbers = new int[count];
        HashMap<String, String> passportsAndNames = new HashMap<>(count);
        ArrayList<String> list = new ArrayList<>(count);


        for (int i = -1; i < count; i++) {
            System.out.println("Введите:"); //просьба ввести свое имя:
//            String inputNumber = scanner.nextLine();
            String inputAnus = scanner.nextLine();
            // Сохраняем введенное число в массиве
            list.add(inputAnus); //добавление значений в маssiv
        }
//
//        // Выводим массив введенных чисел
        System.out.print(list);
////        for (int number : numbers) {
////            System.out.print(number + " ");
////        }
//        System.out.println(passportsAndNames); //вывод мапы на печать

        // Закрываем Scanner
        scanner.close();
    }
}
