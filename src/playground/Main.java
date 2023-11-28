package playground;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Сброс новой строки после ввода числа

        ArrayList<String> listOfStrings = new ArrayList<>();

        // Ввод строк от пользователя
        for (int i = 0; i < length; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            String input = scanner.nextLine();
            listOfStrings.add(input);
        }

        // Вывод содержимого ArrayList
        System.out.println("Содержимое ArrayList:");
        for (String str : listOfStrings) {
            System.out.println(str);
        }
    }
}