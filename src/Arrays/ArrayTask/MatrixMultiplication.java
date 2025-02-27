package Arrays.ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication
{
   static Scanner sc=new Scanner(System.in);
    int row;
    int col;
    int [][] matrix1;
    int [][] matrix2;
    int [][] result;

    void matrixInput()
    {

        System.out.println("Enter the row");
        row=sc.nextInt();
        System.out.println("Enter the column");
        col=sc.nextInt();
        matrix1= new int [row][col];
        matrix2=new int [row][col];
        result=new int [row][col];
        System.out.println("Enter the values for matrix 1");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the values for matrix 2");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }

    }

    void matrixMultiplication()
    {


        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix2.length;j++)
            {
                result[i][j]=(matrix1[i][j]*matrix2[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
    public static void main(String []args)
    {
        MatrixMultiplication mm= new MatrixMultiplication();
       // mm.matrixInput();
        mm.matrixMultiplication();

    }
}
