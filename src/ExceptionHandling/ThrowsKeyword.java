package ExceptionHandling;

public class ThrowsKeyword
{
    static void sit() throws IllegalAccessException, ArithmeticException
    {
        throw new IllegalAccessException();
    }
    public static void main(String[] args)
    {
//           try
//           {
//               sit();
//           }
//           catch(IllegalAccessException r)
//           {
//               System.out.println(r);
//           }
//           finally
//            {
//                System.out.println("hi");
//            }

        Integer j=(787);
        Integer num1=10, num2=10, num3=128,num4=128;
        System.out.println(num1==num2);
        System.out.println(j);
        System.out.println(num3==num4);
    }
}
