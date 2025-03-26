package Interface;

import java.util.function.Function;

public class Function_Interface
{
    public static void main(String[] args)
    {
        Function<Integer,Integer> fun=(a)->a*a;
        System.out.println(fun.apply(3));

    }
}
