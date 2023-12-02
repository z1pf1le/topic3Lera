package kosti;

import java.util.ArrayList;
import java.util.Scanner;


public class MainZaglushka{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Введите количество игроков: ");
//        int players = scanner.nextInt();
//        scanner.nextLine(); // Сброс новой строки после ввода числа
//
//        System.out.print("Введите количество кубиков: ");
//        int diceNumber = scanner.nextInt();
//        scanner.nextLine(); // Сброс новой строки после ввода числа

        ArrayList<String> listOfPlayers = new ArrayList<>();

        int players = 3;

        int diceNumber = 2;
        // Ввод строк от пользователя
//        for (int i = 1; i <= players; i++) {
//            System.out.print("Введите имя " + (i++) + " игрока: ");
//            String input = scanner.nextLine();
//            listOfPlayers.add(input);
//        }
        String igrok1 = "Ivan";
        String igrok2 = "Stepan";
        listOfPlayers.add(igrok1);
        listOfPlayers.add(igrok2);
        Game.play(listOfPlayers, diceNumber);
    }
}