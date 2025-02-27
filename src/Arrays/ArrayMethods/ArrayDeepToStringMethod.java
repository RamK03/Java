package Arrays.ArrayMethods;


import java.util.Arrays;

public class ArrayDeepToStringMethod {
    public static void main(String[] args) {


        Integer []  arr = new Integer[1];
        System.out.println(Arrays.deepToString(arr));
        int[] [] arr2 = new int[2][2];
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.toString(arr2));



    }
}
