package kosti;

import java.util.*;

public class DiceGame {
    public static String playDiceGame(List<String> players, int numberOfDice) throws InterruptedException {
        Map<String, Integer> results = new HashMap<>();

        for (String player : players) {
            int total = 0;
            System.out.print(player + ": ");
            for (int i = 0; i < numberOfDice; i++) {
                int diceResult = (int) (Math.random() * 6) + 1; // бросок кубика
                total += diceResult;

                Thread.sleep(300);
                System.out.print(diceResult + " ");
                Thread.sleep(300);
            }
            results.put(player, total);
            System.out.println("Итог: " + total);
        }

        // Нахождение победителя
        int maxScore = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }
}