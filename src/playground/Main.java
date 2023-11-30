package playground;

import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int players = scanner.nextInt();
        scanner.nextLine(); // Сброс новой строки после ввода числа

        System.out.print("Введите количество кубиков: ");
        int dice = scanner.nextInt();
        scanner.nextLine(); // Сброс новой строки после ввода числа

        ArrayList<String> listOfStrings = new ArrayList<>();

        // Ввод строк от пользователя
        for (int i = 0; i < players; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            String input = scanner.nextLine();
            listOfStrings.add(input);
        }

        // Вывод содержимого ArrayList
        System.out.println("Содержимое ArrayList:");
        for (String str : listOfStrings) {
            System.out.println(str);
        }

        //создание экземпляра мапы и заполнение ее именами и количеством набранных очков
        HashMap<String, Integer> playerssAndScores = new HashMap<>();
        for (int i = 0; i < players; i++) {
            int score = 0;
            for (int j = 0; j < players; j++) {
                score += GenRand.rand();
            }
            playerssAndScores.put(listOfStrings.get(i), score);
        }
        System.out.println(playerssAndScores);
    }
}