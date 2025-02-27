package BasicProblems;

public class NewStar {
    public static void main(String[] args)
    {
        int rows=6;
        int space=rows-1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=space;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
