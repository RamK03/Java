package Arrays.ArrayTask;

import java.util.Scanner;

public class TaskArrayReverse
{
    Scanner sc=new Scanner(System.in);

    int [] arrayInput()
    {
        int [] numbers;//declaration
        numbers = new int [4];//instanstiation
        numbers[0]=3;//iniitialization

        System.out.println("Enter the range you want");
        int range= sc.nextInt();
        int [] dummy=new int [range];
        for(int i=0;i<dummy.length;i++)
        {
            System.out.println("Enter the number for index "+i);
            dummy[i]=sc.nextInt();
        }
        return dummy;
    }

    void reversedArray()
    {
        int [] original=arrayInput();
        int originalRange=original.length;
        int []reversedArray=new int [originalRange];
        int j=0;
            for(int i=original.length-1;i>=0;i--)
            {
                reversedArray [j]=original[i];
                j++;
            }

        System.out.println("The reversed array is ");
            int k=0;
            for(int a:reversedArray)
            {
                System.out.println("Index "+k+"="+a);
                k++;
            }
    }


    public static void main(String [] args)
    {
        TaskArrayReverse re=new TaskArrayReverse();
        re.reversedArray();

    }
}
