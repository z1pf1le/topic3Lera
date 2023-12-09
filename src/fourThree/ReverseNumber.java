package fourThree;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseNumber {
    public static boolean separateDigits(int number) {
        String numberStr = String.valueOf(number);
        Integer[] arr = new Integer[numberStr.length()];
        int j = numberStr.length();
        for (int i = 0; i < numberStr.length(); i++) {
//            for (int j = numberStr.length()-1; j > 0; j--){
//                arr[j] = numberStr.charAt(i);

                arr[i] = j;
                j--;

            System.out.println(numberStr.charAt(i));
        }
        System.out.println(Arrays.deepToString(arr));
        return false;

    }


}
