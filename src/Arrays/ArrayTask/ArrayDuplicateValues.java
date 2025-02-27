package Arrays.ArrayTask;

import java.util.Arrays;
public class ArrayDuplicateValues {
    int [] original_Array={1,2,3,4,1,2,3,4,3,4};
    int [] duplicate_values=new int[original_Array.length];
    boolean [] check_Array=new boolean [original_Array.length];

    void duplicateValues()
    {
        int k=0;
        for(int i=0;i<original_Array.length;i++)
        {
            for(int j=i+1;j<original_Array.length;j++)
            {
                if(check_Array[i]){
                    continue;
                }
                if(original_Array[i]==original_Array[j])
                {
                    duplicate_values[k]=original_Array[j];
                    check_Array[j]=true;
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate_values));
    }

    public static void main(String []args )
    {
        ArrayDuplicateValues ac=new ArrayDuplicateValues();
        ac.duplicateValues();
    }
}
