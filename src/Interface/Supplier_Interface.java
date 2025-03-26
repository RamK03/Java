package Interface;

import java.util.function.Supplier;

public class Supplier_Interface
{
    public static void main(String[] args)
    {
        Supplier<Integer> sup=()->3 ;
        System.out.println(sup.get());

        Supplier_Interface obj= new Supplier_Interface();
        System.out.println(obj instanceof Supplier_Interface);

    }
}
