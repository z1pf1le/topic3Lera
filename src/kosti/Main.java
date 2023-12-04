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
        ArrayList<String> listOfWinners = new ArrayList<>(); //динамический массив, в который отправятся победители

        // Ввод строк от пользователя
        for (int i = 0; i < players; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            String input = scanner.nextLine();
            listOfPlayers.add(input);
        }
        listOfPlayers.add("Computer"); //добавление Компьютера в конец списка

        String firstWinner = DiceGame.playDiceGame(listOfPlayers, diceNumber); //ищу первого победителя
        System.out.println("первый победитель: " + firstWinner);
        ArrayList<String> listOfPlayers2 = MoveElementToFirst.moveElementToFirst(listOfPlayers, firstWinner);//получаю новый список
        System.out.println("новый порядок игроков: " + listOfPlayers2);
        listOfWinners.add(firstWinner);

        String secondWinner = DiceGame.playDiceGame(listOfPlayers2, diceNumber);//ищу второго победителя
        System.out.println("второй победитель: " + secondWinner);
        ArrayList<String> listOfPlayers3 = MoveElementToFirst.moveElementToFirst(listOfPlayers2, firstWinner);//получаю новый список
        System.out.println("новый порядок игроков: " + listOfPlayers3);
        listOfWinners.add(secondWinner);

        String thirdWinner = DiceGame.playDiceGame(listOfPlayers3, diceNumber);//ищу третьего победителя
        System.out.println("третий победитель: " + thirdWinner);
        ArrayList<String> listOfPlayers4 = MoveElementToFirst.moveElementToFirst(listOfPlayers3, firstWinner);//получаю новый список
        System.out.println("новый порядок игроков: " + listOfPlayers4);
        listOfWinners.add(thirdWinner);

        String fourthWinner = DiceGame.playDiceGame(listOfPlayers4, diceNumber);//ищу четвертого победителя
        System.out.println("четвертый победитель: " + fourthWinner);
        ArrayList<String> listOfPlayers5 = MoveElementToFirst.moveElementToFirst(listOfPlayers4, firstWinner);//получаю новый список
        System.out.println("новый порядок игроков: " + listOfPlayers5);
        listOfWinners.add(fourthWinner);

        String fifthWinner = DiceGame.playDiceGame(listOfPlayers5, diceNumber);//ищу пятого победителя
        System.out.println("пятый победитель: " + fifthWinner);
        ArrayList<String> listOfPlayers6 = MoveElementToFirst.moveElementToFirst(listOfPlayers4, firstWinner);//получаю новый список
        System.out.println("новый порядок игроков: " + listOfPlayers6);
        listOfWinners.add(fifthWinner);

        String sixthWinner = DiceGame.playDiceGame(listOfPlayers6, diceNumber);//ищу шестого победителя
        System.out.println("шестой победитель: " + sixthWinner);
        ArrayList<String> listOfPlayers7 = MoveElementToFirst.moveElementToFirst(listOfPlayers4, firstWinner);//получаю новый список
        System.out.println("новый порядок игроков: " + listOfPlayers7);
        listOfWinners.add(sixthWinner);

        String seventhWinner = DiceGame.playDiceGame(listOfPlayers7, diceNumber);//ищу седьмого победителя
        System.out.println("седьмой победитель: " + seventhWinner);
        listOfWinners.add(seventhWinner);

        //поиск игрока, который больше всех выиграл
        System.out.println("Больше всех побед одержал: ");
        System.out.println(FindMostFrequentElement.findMostFrequentElement(listOfWinners));
    }
}