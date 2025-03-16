package BasicProblems.src;


import static java.lang.System.*;

class A
{
     void ad()
    {
        out.println("parent");
    }
}
class B extends A
{
    void ad()
    {
        out.println("child");
    }
}
public class Dummy
{
    public static void main(String[] args)
    {
        A obj=new B();
        obj.ad();
    }
}

