package playground;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int players = 3;
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];

        for (int i = 0; i < players; i++) {
            System.out.print("Введите строку: ");
            array[i] = scanner.nextLine();
        }

        System.out.println("Вы ввели следующие строки:");
        for (String str : array) {
            System.out.println(str);
        }
    }
}