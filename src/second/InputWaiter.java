package second;

import java.util.Scanner;

public class InputWaiter {
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите своё имя и нажмите Enter:");

        // Ждем ввода с клавиатуры
        String input = scanner.next();

        // Выводим приветствие после ввода
        System.out.println("Привет, " + input.toString() + ", спасибо за ввод.");

        // Закрываем Scanner
        scanner.close();

    }
}
