package kosti;

import java.util.ArrayList;

public class Game{
    static void play(ArrayList<String> listOfPlayers, int diceNumber) throws InterruptedException {
        ArrayList<Integer> scoreCount = new ArrayList<>();

        for (int j=1; j<=diceNumber; j++) {
            System.out.println("игроки бросают " + j + "й кубик");
            for (int i = 0; i < listOfPlayers.size(); i++) {
                System.out.println(listOfPlayers.get(i) + " бросает кости");
                Thread.sleep(1000);
                int score = GenRand.rand();
                System.out.println(score);
                Thread.sleep(1000);
                scoreCount.add(score);
            }
        }
        System.out.println(scoreCount);
    }
}