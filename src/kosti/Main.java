package kosti;

import third.GenRand;
import third.Winner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int players = scanner.nextInt();
        scanner.nextLine(); // Сброс новой строки после ввода числа

        System.out.print("Введите количество кубиков: ");
        int diceNumber = scanner.nextInt();
        scanner.nextLine(); // Сброс новой строки после ввода числа

        ArrayList<String> listOfPlayers = new ArrayList<>();

        // Ввод строк от пользователя
        for (int i = 0; i < players; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            String input = scanner.nextLine();
            listOfPlayers.add(input);
        }
        listOfPlayers.add("Computer"); //добавление Компьютера в конец списка
        String firstWinner = DiceGame.playDiceGame(listOfPlayers, diceNumber);
        System.out.println("первый победитель: " + firstWinner);
        System.out.println(DiceGame.playDiceGame(listOfPlayers, diceNumber));
        String secondWinner = DiceGame.playDiceGame(listOfPlayers, diceNumber);
        System.out.println("второй победитель: " + secondWinner);

    }
}