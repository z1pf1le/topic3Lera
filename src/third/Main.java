package third;

import java.util.ArrayList;
import java.util.HashMap;
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
        int score = 0;
        //создание экземпляра мапы и заполнение ее именами и количеством набранных очков
        HashMap<String, Integer> playersAndScores = new HashMap<>();
        for (int i = 0; i < players; i++) { //для всех игроков

            for (int j = 0; j < players; j++) {
                score += GenRand.rand();
            }
            playersAndScores.put(listOfStrings.get(i), score);
        }
        int score_comp = 0;
        for (int j = 0; j < players; j++) {
            score_comp += GenRand.rand();
        }
        playersAndScores.put("computer", score_comp);
        System.out.println("Счёт: ");
        System.out.println(playersAndScores);
        Winner.is(playersAndScores);
    }
}