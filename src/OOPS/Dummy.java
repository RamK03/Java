package OOPS;

class B
{

    int a=4;
}

class A extends B
{
    A(int a)
    {

        System.out.println(a);

    }
    int a=84;
}

public class Dummy extends A
{
    int a=10;
    static Dummy dm=new Dummy(2);
    Dummy(int a)
    {
        super(a);


    }

    void ad()
    {
        int a=90;
        dm.a=29;
        System.out.println(this.a);

    }

    public static void main(String[] args) {
        Dummy dm1=new Dummy(2);


     //   dm.ad();
    }
}
