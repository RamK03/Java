package OOPS;

class Operation1
{

    long  addition(long num2,int num1)
    {
        System.out.println("Parent 1");
        return  (num1+num2);
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
    int sub(int num1,int num2)
    {
        System.out.println(" Child");
        return (num1-num2);
    }
}

public class Polymorphism
{
    public static void main(String[] args)
    {
        Operation1 mc= new Operation2();
        Operation1 mn= new Operation1();
        System.out.println("Method Overloading "+ mn.addition(9,8));
        System.out.println("Method Overriding "+ mc.sub(3,9));

    }

}
