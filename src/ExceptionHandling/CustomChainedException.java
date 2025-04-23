package ExceptionHandling;

import java.util.InputMismatchException;

class NoNumbers extends Exception
{
    NoNumbers(String s,Throwable cause)
    {
        super(s,cause);
    }
}
public class CustomChainedException
{
    public static void main(String[] args) throws NoNumbers {
//        try
//        {
//            int r=4/0;
//
//
//        }
//        catch(ArithmeticException e)
//        {
////            System.out.println(e.getCause());
////            System.out.println(e.getMessage());
//            try {
//                throw new NoNumbers("No numbers allowed", e);
//            }
//            catch(NoNumbers t){
//
//            }
//        }

    }
}
