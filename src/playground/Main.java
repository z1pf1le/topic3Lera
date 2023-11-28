package playground;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Введите количество строк: ");
//        int n = scanner.nextInt();
//        scanner.nextLine(); // съедаем лишний переход на новую строку

        Integer[] array = new Integer[2];
        String str1="Введите количество игроков";
        String str2="Введите количество кубиков";
        for (int i = 0; i < 2; i++) {
            System.out.print(str1 + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Вы ввели следующие строки:");
        for (Integer str : array) {
            System.out.println(str);
        }
    }
}