package BasicProblems;

import java.sql.SQLOutput;

public class TrianglSpace {
    public static void main(String[] args)
    {
        int rows=5;
        int l=0;

        for(int i=1;i<=rows;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=9;k++)
            {
                    if((k==1||i==rows||k==(2*i-1)))
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }

}
