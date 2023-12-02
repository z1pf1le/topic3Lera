package kosti;

import java.util.ArrayList;
import java.util.Scanner;

public class Game2{
    static String play(ArrayList<String> listOfPlayers, int diceNumber) throws InterruptedException {
        ArrayList<Integer> scoreCount = new ArrayList<>();

        for (int j=1; j<=diceNumber; j++) {
            System.out.println("игроки бросают " + j + "й кубик");
            for (int i = 0; i < listOfPlayers.size(); i++) {
                System.out.println(listOfPlayers.get(i) + " бросает кости");
                Thread.sleep(300);
                int score = GenRand.rand();
                System.out.println(score);
                Thread.sleep(300);
                scoreCount.add(score);
            }
            System.out.println("компьютер бросает кости");
            Thread.sleep(300);
            int score = GenRand.rand();
            System.out.println(score);
            Thread.sleep(300);
            scoreCount.add(score);

        }
        System.out.println(scoreCount);
//        ArHandler.returnPlayerNumber(scoreCount);
        System.out.println(listOfPlayers.get(ArHandler.returnPlayerNumber(scoreCount)));
        return null;
    }
}