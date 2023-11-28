package first;

import java.util.Scanner;

// Пример класса, экземпляры которого мы будем создавать
class ExampleClass {
    // Конструктор класса
    public ExampleClass() {
        System.out.println("Создан новый экземпляр класса ExampleClass");
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


