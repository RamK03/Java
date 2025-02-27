package Arrays.ArrayMethods;

import java.util.Arrays;
public class ArraySetAllMethod {
    public static void main(String[] args) {
        int [] arr= new int [5];
        System.out.println(Arrays.toString(arr));
        Arrays.setAll(arr,a->1-a);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,2,4);
    }
}
