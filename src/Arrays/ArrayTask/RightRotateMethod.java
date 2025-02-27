package Arrays.ArrayTask;
import java.util.Arrays;
import java.util.Scanner;
public class RightRotateMethod
{
    static Scanner sc=new Scanner(System.in);
    int [] arr={1,2,3,4,5,6};
    int lastElement;
    int n;

    void rotate()
    {
        System.out.println("Enter the no of times you want to rotate");
        n=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++)
        {
            lastElement=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {

                    arr[j]=arr[j+1];
            }
            arr[arr.length-1]=lastElement;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
         RightRotateMethod rc=new RightRotateMethod();
         rc.rotate();



    }

}
