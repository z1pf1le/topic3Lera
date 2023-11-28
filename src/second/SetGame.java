package second;

import java.util.Scanner;

public class SetGame{
    int playerCount;
    int cubesNumber;

    public SetGame(int playerCount, int cubesNumber) {
        this.playerCount = playerCount;
        this.cubesNumber = cubesNumber;
    }

    public void Start(){
        for(int i = 1; i < 9; i++){

            new InputWaiter().input();


        }

    }
}
