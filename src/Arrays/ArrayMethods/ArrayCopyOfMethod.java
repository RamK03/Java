package Arrays.ArrayMethods;

import java.util.Arrays;
public class ArrayCopyOfMethod {
    public static void main(String[] args) {
        int []arr=new int[4];
        arr[0]=1;
        int []copyArray=Arrays.copyOf(arr,arr.length);

        copyArray= Arrays.copyOfRange(arr,1,3);
        System.out.println(Arrays.toString(copyArray));
    }
}
