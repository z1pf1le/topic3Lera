package fourThree;

import java.util.Arrays;

public class ReverseNumber {
    public static Integer[] separateDigits(int number) {
        String numberStr = String.valueOf(number);
        Integer[] arr = new Integer[numberStr.length()];
        int j = numberStr.length();
//        Integer result=0;
        for (int i = 0; i < numberStr.length(); i++) {
//            for (int j = numberStr.length()-1; j > 0; j--){
//                arr[j] = numberStr.charAt(i);
                Integer preResult = i * numberStr.length();
                arr[i] = j;
                j--;
//            result = result + preResult;
            System.out.println(numberStr.charAt(i));
        }
        System.out.println(Arrays.deepToString(arr));
//        System.out.println(result);
        return arr;
    }

    public static double reverse(int number){
        Integer[] arr = ReverseNumber.separateDigits(number);
        int result=0;
        for(int i = 0; i < arr.length; i++){
//            Integer preResult = arr[i] * (arr.length-i);
            int preResult = (int) (Math.pow(10, arr.length-i) * arr[i]);
            System.out.println(Math.pow(10, arr.length-i) * arr[i]);
            result += preResult;
        }
        return result/10;
    }


}
