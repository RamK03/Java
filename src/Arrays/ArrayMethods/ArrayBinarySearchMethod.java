package Arrays.ArrayMethods;

import java.util.Arrays;

public class ArrayBinarySearchMethod {
    public static void main(String[] args) {
        int [] arr={1,3,2,5,4};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(arr[1]);
    }
}
