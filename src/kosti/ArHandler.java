package kosti;

import java.util.ArrayList;
import java.util.Collections;

public class ArHandler{
    //возвращает номер игрока, набравшего наибольшее кол-во очков
    public static int returnPlayerNumber(ArrayList<Integer> scoreCount) {

        ArrayList<Integer> winnersNumber = new ArrayList<>();

        int scoresTotal = 0;
        for (int i = 0; i < (scoreCount.size())/2; i++) {
            scoresTotal = scoreCount.get(i) + scoreCount.get(i / scoreCount.size());
            winnersNumber.add(scoresTotal);
        }
        System.out.println(winnersNumber);

        int max = 0;

        max = (int) Collections.max(winnersNumber);
        System.out.println(max);
        System.out.println(winnersNumber.indexOf(max));
        return winnersNumber.indexOf(max);
    }
}
