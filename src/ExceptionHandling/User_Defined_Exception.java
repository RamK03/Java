package ExceptionHandling;
import java.util.*;

class InvalidEmail extends RuntimeException
{
    InvalidEmail(String s)
    {
        super(s);
    }
}
public class User_Defined_Exception
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        try
        {
            System.out.println("Enter your E-Mail Id");
            String email = sc.nextLine();
            if (!email.matches("^[a-zA-Z0-9._%+-]+@gmail$"))
            {
                throw new InvalidEmail("E-mail must have @gmail.com and alphabets and numbers only allowed");
            }
        }
        catch(InvalidEmail e)
        {
            System.out.println(e);
        }
    }
}
