package Arrays.ArrayMethods;

import java.util.Arrays;

public class ArrayDeepEqualsMethod {
    public static void main(String[] args) {
        int [][]arr=new int[4][2];
        int [][]arr2=new int[4][2];
        int [][]arr3=arr;
        arr[2][0]=1;
        arr2[2][0]=1;

      //System.out.println(Arrays.deepEquals(arr,arr2));
      System.out.println(Arrays.equals(arr,arr2));
      System.out.println(arr.equals(arr2));
    }
}
