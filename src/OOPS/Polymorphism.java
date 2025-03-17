package OOPS;
import java.util.Arrays;
class Operation1
{
    Operation1(){}
    Operation1(int v)
    {
        System.out.println(v);
    }
    int value=9;
    int  addition(long num2,int num1)
    {
        System.out.println("Parent 1");
        return  (int)(num1+num2);
    }

    int addition(int num1,int num2)
    {
        System.out.println("Parent 2");
        return num1-num2;
    }

     int sub(int num1,int num2)
    {
        System.out.println("Parent");
        return num1-num2;
    }
}

class Operation2 extends Operation1
{
    Operation2(int v)
    {
        super(v);
        super.addition(v,3);
        System.out.println(v);
    }
    int value=8;

       int sub(int num1,int num2)
    {
        System.out.println(" Child");
        return (short) (num1-num2);
    }

}

public class Polymorphism
{
    public static void main(String[] args)
    {
        Operation1 mc= new Operation2(5);
        Operation1 mn= new Operation1();
        System.out.println("Method Overloading "+ mn.addition(9l,8));
        System.out.println("Method Overriding "+ (mc.sub(3,9)));
        System.out.println(mc.value);

    }

}
