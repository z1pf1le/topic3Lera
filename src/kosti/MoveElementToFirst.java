package kosti;

import java.util.Arrays;



public class MoveElementToFirst {
//    public static void main(String[] args) {
//        String[] inputArray = {"первый", "второй", "третий", "четвертый"};
//        String targetString = "третий";
//
//        String[] resultArray = moveElementToFirst(inputArray, targetString);
//
//        System.out.println(Arrays.toString(resultArray));
//    }

    public static String[] moveElementToFirst(String[] array, String target) {
        if (array == null & array.length == 0) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                // меняем местами элементы
                String temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                break;
            }
        }

        return array;
    }
}
