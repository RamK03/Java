package Arrays.ArrayTask;
import java.util.*;

public class ArrayMatrixRotation
{
    static void rotate90degree(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {

            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        System.out.println(Arrays.deepToString(arr));

        for(int j=0;j<arr.length;j++)
        {


            int i=0;
            int k=2;
            int temp=arr[j][i];
            arr[j][i]=arr[j][k];
            arr[j][k]=temp;


        }
        System.out.println(Arrays.deepToString(arr));

    }

    void rotate270degree(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {

            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }


        for(int j=0;j<arr.length;j++)
        {

            for(int i=0,k=2;i<k;i++,k--)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[k][j];
                arr[k][j]=temp;

            }
        }
        System.out.println(Arrays.deepToString(arr));

    }

    void rotate180degree(int [][]arr)
    {
        int n=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {

            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[n-i][n-j];
                arr[n-i][n-j]=arr[n-j][n-i];
                arr[n-j][n-i]=temp;

            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String  args[])
    {
        int [][]arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        rotate90degree(arr);
	/*
		int temp=arr[0][1];
		arr[0][1]=arr[1][0];
		arr[1][0]=arr[2][1];
		arr[2][1]=arr[1][2];
		arr[1][2]=temp;


		int temp1=arr[0][2];
		arr[0][2]=arr[0][0];
		arr[0][0]=arr[2][0];
		arr[2][0]=arr[2][2];
		arr[2][2]=temp;
		System.out.println();
		System.out.println(Arrays.deepToString(arr));*/


    }
}
