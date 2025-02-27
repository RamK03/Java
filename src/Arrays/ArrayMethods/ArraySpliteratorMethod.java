package Arrays.ArrayMethods;

import java.util.Arrays;
import java.util.Spliterator;

public class ArraySpliteratorMethod {
    public static void main(String[] args) {
        int []arr=new int[5];
        arr=java.util.stream.IntStream.range(1,8+1).toArray();
        Arrays.stream(arr);
        Spliterator.OfInt spliterator = Arrays.spliterator(arr);



    }
}
