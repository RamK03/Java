package Arrays.ArrayMethods;

import java.util.Arrays;

public class ArrayFillMethod {
    public static void main(String[] args) {
        int [] arr= new int[5];
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
