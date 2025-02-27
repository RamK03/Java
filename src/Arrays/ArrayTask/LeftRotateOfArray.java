package Arrays.ArrayTask;

import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateOfArray
{
    Scanner sc=new Scanner(System.in);
    int [] array=new int[5];
    void rotate()
    {
        System.out.println("Enter how many times you want to rotate");
        int n=sc.nextInt();
        for(int i=0;i<array.length;i++)
        {
            array[i]=(i*i)-1;
        }
        System.out.println(Arrays.toString(array));
        for(int i=0;i<n;i++)
        {
            int j,temp;
            temp = array[0];

            for ( j = 0; j < array.length - 1; j++)
            {
                array[j] = array[j + 1];
            }
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));


    }
    public static void main(String[] args)
    {
        LeftRotateOfArray lf= new LeftRotateOfArray();
        lf.rotate();

    }
}
