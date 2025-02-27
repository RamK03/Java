package BasicProblems;

public class DiamondNew {
    public  void main(String[] args)
    {
        int rows=8;
        for(int i=1;i<=8;i++)
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
        for(int i=8;i>=1;i--)
        {
            for(int j=i;j<=8;j++)
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
}
