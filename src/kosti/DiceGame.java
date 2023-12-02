package kosti;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        int[] playerScores = new int[numPlayers];
        String[] playerNames = new String[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            playerNames[i] = scanner.next();
        }

        int numRounds = 7;

        for (int round = 0; round < numRounds; round++) {
            System.out.println("nРаунд " + (round + 1));
            for (int i = 0; i < numPlayers; i++) {
                System.out.println(playerNames[i] + ", нажмите Enter, чтобы кинуть кости");
                scanner.nextLine(); // очистка буфера
                scanner.nextLine();

                int diceResult = (int) (Math.random() * 6) + 1; // имитация броска кости
                playerScores[i] += diceResult;
                System.out.println(playerNames[i] + " выбросил " + diceResult + ". Очки: " + playerScores[i]);
            }

            int winnerIndex = 0;
            int maxScore = playerScores[0];
            for (int i = 1; i < numPlayers; i++) {
                if (playerScores[i] > maxScore) {
                    maxScore = playerScores[i];
                    winnerIndex = i;
                }
            }

            System.out.println("Победитель раунда " + (round + 1) + ": " + playerNames[winnerIndex]);
            playerScores[winnerIndex] = 0; // обнуляем очки у победителя для следующего раунда
        }

        int overallWinnerIndex = 0;
        int overallMaxScore = playerScores[0];
        for (int i = 1; i < numPlayers; i++) {
            if (playerScores[i] > overallMaxScore) {
                overallMaxScore = playerScores[i];
                overallWinnerIndex = i;
            }
        }

        System.out.println("nИтоговый победитель: " + playerNames[overallWinnerIndex] + " с общим количеством очков: " + overallMaxScore);
    }
}
