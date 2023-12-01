package gpt;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя на ввод количества игроков
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        // Запрос у пользователя на ввод количества кубиков
        System.out.print("Введите количество кубиков: ");
        int numDice = scanner.nextInt();

        // Массивы для хранения имен игроков и их суммарных результатов
        String[] playerNames = new String[numPlayers];
        int[] playerTotalScores = new int[numPlayers];

        // Цикл для ввода имен каждого игрока
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            playerNames[i] = scanner.next();
        }

        // Игра в 7 конов
        int numRounds = 7;
        int[] roundScores = new int[numPlayers]; // Результаты каждого раунда для каждого игрока

        // Цикл по каждому кону
        for (int round = 0; round < numRounds; round++) {
            System.out.println("Раунд " + (round + 1));
            for (int i = 0; i < numPlayers; i++) {
                // Здесь можно добавить запрос у игрока на бросок костей
                // и логику расчета результата раунда
                int diceResult = (int) (Math.random() * 6) + 1; // Имитация броска кости
                roundScores[i] += diceResult; // Накапливаем результаты раунда
                System.out.println(playerNames[i] + ": " + diceResult);
            }
        }

        // Суммирование результатов и определение победителя
        int maxScore = 0;
        String winner = "";
        for (int i = 0; i < numPlayers; i++) {
            playerTotalScores[i] = roundScores[i];
            if (playerTotalScores[i] > maxScore) {
                maxScore = playerTotalScores[i];
                winner = playerNames[i];
            }
        }

        // Вывод итоговых результатов
        System.out.println("Итоговые результаты:");
        for (int i = 0; i < numPlayers; i++) {
            System.out.println(playerNames[i] + ": " + playerTotalScores[i]);
        }

        System.out.println("Победитель: " + winner);

        // Дополнительная логика для игры компьютера можно добавить здесь
    }
}