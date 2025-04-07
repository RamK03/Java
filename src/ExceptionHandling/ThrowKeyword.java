package ExceptionHandling;

class ThrowKeyword
{
    static void jump()
    {
        try
        {
            throw new RuntimeException("Hi");
        }
        catch(RuntimeException e)
        {
            System.out.println("Exception Handled");

            throw e;
        }
    }

    public static void main(String args[])
    {

        try
        {
            jump();
        }
        catch(RuntimeException e)
        {
            System.out.println("Exception Catched");
            System.out.println( e.getSuppressed());
        }


    }
}