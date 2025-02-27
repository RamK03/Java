package BasicProblems;

import java.util.*;
public class Operation {

    void factorial(int num){
        int factRes=num;
        for (int i=1;1<num;i++){
            factRes*=(num-1);
            num--;

        }
        System.out.println(factRes);
    }
    public static void main(String[]args){
        Operation op=new Operation();
      int [] arr=java.util.stream.IntStream.range(23,30).toArray();
        System.out.println(Arrays.toString(arr));
        int [] arr1=java.util.stream.IntStream.rangeClosed(1,5).toArray();
        System.out.println(Arrays.toString(arr1));

    }
}
