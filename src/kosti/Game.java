package kosti;

import java.util.ArrayList;

public class Game{
    static void play(ArrayList<String> listOfPlayers) throws InterruptedException {
        ArrayList<Integer> scoreCount = new ArrayList<>();
        for(int i=0; i<listOfPlayers.size(); i++){
            System.out.println(listOfPlayers.get(i) + " бросает кости");
            Thread.sleep(500);
            int score = GenRand.rand();
            System.out.println(score);
            Thread.sleep(500);
            scoreCount.add(score);
        }
        System.out.println(scoreCount);
    }
}
