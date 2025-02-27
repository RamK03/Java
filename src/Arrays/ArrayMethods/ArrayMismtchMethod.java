package Arrays.ArrayMethods;

import java.util.Arrays;

public class ArrayMismtchMethod
{
    public static void main(String[] args)
    {
          int []array=java.util.stream.IntStream.range(2,6).toArray();
        int []array1=java.util.stream.IntStream.range(2,5).toArray();
        System.out.println(Arrays.mismatch(array,array1));



    }
}
