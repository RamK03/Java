package BasicProblems;

public class StarPattern {
    public static void main(String[] args)
    {
        int rows=8;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=2;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++)
            {
               if(i==1||i==5||k==1||k==4)
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
