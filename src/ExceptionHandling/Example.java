package ExceptionHandling;

public class Example
{
    public static int go()
    {
        try
        {
            int a = 2 ;
            return 10;
        }
        finally
        {
            System.out.println("error resolved");

        }
    }
    public static void main (String args[])
    {
        go();
        try
        {
            int a = 2 ;

        }
        finally
            {
                System.out.println("error resolved");

            }


    }
}
