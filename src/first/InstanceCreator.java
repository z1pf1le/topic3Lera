package first;

import java.util.Scanner;

public class InstanceCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя ввести количество экземпляров
        System.out.println("Введите количество экземпляров класса, которые вы хотите создать:");
        int count = scanner.nextInt();

        // Создание заданного количества экземпляров класса
        for (int i = 0; i < count; i++) {
            ExampleClass instance = new ExampleClass();
        }

        System.out.println("Было создано " + count + " экземпляров класса ExampleClass");

        // Закрываем Scanner
        scanner.close();
    }
}