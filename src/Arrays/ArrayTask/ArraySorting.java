package Arrays.ArrayTask;

import java.util.Arrays;

public class ArraySorting {
    public static void main (String [] args)
    {
        int [] greater={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(greater));
        int temp;
        for(int i=0;i<greater.length;i++)
        {
            for(int j=i+1;j<greater.length;j++)
            {
                if(greater[i]>greater[j])
                {
                   temp=greater[i];
                   greater[i]=greater[j];
                   greater[j]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(greater));
    }
}
