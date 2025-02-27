package Arrays.ArrayTask;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayWithAmstrong
{

    int range;
    static Scanner sc= new Scanner(System.in);
    int b;
    boolean s;
    boolean [] boolArray;

    int [] inputArray()
    {
        System.out.println("Enter range of the array");
        this.range =sc.nextInt();
        int [] rawArray=new int [range];
        for(int i=0;i<rawArray.length;i++)
        {
            System.out.println("Enter the Number");
            rawArray [i]=sc.nextInt();
        }

        return rawArray;
    }

    void manipulate()
    {

        //int l=0;
        int[] originalArray = inputArray();
        this.boolArray= new boolean[range];
        /* for(int a:originalArray){
            System.out.println(a);
            boolArray [l++]=checkAmstrong(a);
        }*/
       for(int n=0;n<originalArray.length;n++)
        {
            boolArray[n]=checkAmstrong(originalArray[n]);
        }
        System.out.println(Arrays.toString(boolArray));
    }

    boolean checkAmstrong(int b)
    {
        boolean result =false;
        int count=0;
        int originalNum=b;
        int dummyNum=b;
        int sumRes=0;
        int temp;

        for(int i=1;b>0;i++)
        {
            b/=10;
            count++;
        }
        for(int j=1;0<dummyNum;j++)
        {
            temp=dummyNum%10;
            sumRes+=(int)(Math.pow(temp,count));
            dummyNum/=10;
        }
        return originalNum==sumRes;
    }
    public static void main (String [] args)
    {
        ArrayWithAmstrong ac= new ArrayWithAmstrong();
        ac. manipulate();
    }
}
