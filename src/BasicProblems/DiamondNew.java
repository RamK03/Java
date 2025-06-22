package BasicProblems;

public class DiamondNew {

    public static void main(String []arfs)
    {
        main();
        main("");
    }
    public static void main(String args)
    {
        int rows=8;
        for(int i=1;i<=rows;i++)
        {
            for(int j=rows;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1||k==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int m=1;m<=2*i-1;m++)
            {
                if(m==1||m==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    public static void main() {
        int rows = 8;

        // Upper half
        for (int i = 1; i <= rows; i++) {
            printSpaces(rows - i);
            printHollowLine(i);
        }

        // Lower half
        for (int i = rows; i >= 1; i--) {
            printSpaces(rows - i);
            printHollowLine(i);
        }
    }

    static void printSpaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    static void printHollowLine(int row) {
        for (int i = 1; i <= 2 * row - 1; i++) {
            if (i == 1 || i == 2 * row - 1) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }
}
