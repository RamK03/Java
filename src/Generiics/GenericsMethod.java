package Generiics;

public class GenericsMethod
{
    public <T> void names( T [] sw)
    {
       for(T d:sw) System.out.println(d);
    }

    public <T,U> T name(T se)
    {
        U[] of=(U[]) new Object [3];
        names(of);
        return se;
    }

    public  <T extends Number> void calculate(T a,T b)
    {
        int result = a.intValue()+b.intValue();
        System.out.println(result);
    }

    public static void main(String[] args)
    {

        GenericsMethod obj= new GenericsMethod();
         int result =obj.name(5);
        obj.names(new Integer []{2,3,4,4});
        System.out.println(result);
    }
}
