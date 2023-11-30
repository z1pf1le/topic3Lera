package playground;

import java.util.Random;

public class GenRand{
    static int rand() {
        int min = 1; // Нижняя граница диапазона
        int max = 6; // Верхняя граница диапазона

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min; // Генерация случайного числа в диапазоне от min до max

        return randomNumber;
    }
}
