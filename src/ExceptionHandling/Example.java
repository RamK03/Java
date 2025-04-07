package ExceptionHandling;

public class Example
{
    public static void main (String args[])
    {
        try
        {
            int a = 2 / 0;
        }
        catch (Exception e)
        {
            try
            {
                System.out.println(e);
            }
            catch(Exception r)
            {
                System.out.println(e.hashCode());
            }
            finally
            {
                System.out.println("error resolved");

            }
        }
        System.out.println("Hi");
    }
}
