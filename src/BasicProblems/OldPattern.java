package BasicProblems;

public class OldPattern {
    public static void main(String[] args)
    {
        for(int i=9;i>=1;i--)
        {
            for (int j = i; j <= 9; j++)
            {
            System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1||k==2*i-1||i==9)
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
}
