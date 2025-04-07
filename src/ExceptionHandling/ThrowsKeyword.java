package ExceptionHandling;

public class ThrowsKeyword
{
    static void sit() throws IllegalAccessException, ArithmeticException
    {
        throw new IllegalAccessException();
    }
    public static void main(String[] args)
    {
           try
           {
               sit();
           }
           catch(IllegalAccessException r)
           {
               System.out.println(r);
           }
    }
}
