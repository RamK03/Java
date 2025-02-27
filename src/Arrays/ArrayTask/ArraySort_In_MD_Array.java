package Arrays.ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort_In_MD_Array
{
    Scanner sc= new Scanner(System.in);

    int [][] array=new int [2][3];
    int startIndex=0;
    int endIndex=1;

    void sorting()
    {
        System.out.println("The array has "+ array.length+" rows ");

        for (int i = 0; i < array.length; i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.println("Enter the values");
                array[i][j]=sc.nextInt();
            }
        }
        int row_No;
        do {
            System.out.println("Enter the row no to sort");
            row_No = sc.nextInt();
        }while(row_No>=array.length||row_No<0);
        startIndex=row_No-1;
        endIndex=startIndex+1;

        System.out.println(Arrays.deepToString(array));
        int temp;
        for(int i=startIndex;i<row_No;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                for(int k=j+1;k<=array[i].length-1;k++)
                {
                    if(array[i][j]>array[i][k])
                    {
                        temp=array[i][k];
                        array[i][k]=array[i][j];
                        array[i][j]=temp;
                    }
                }
            }
        }
        /*Arrays.sort(array[row_No]);*/
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));

    }

    public static void main(String[] args)
    {
        ArraySort_In_MD_Array ac= new ArraySort_In_MD_Array();
        ac.sorting();

    }
}
