package Interface;

import java.util.function.*;

public class Predicate_Interface
{
    public static void main(String[] args)
    {
        Integer [] arr={3,4,5};
        //isEqual()
        Predicate <Integer> isEqual=Predicate.isEqual(5);
        System.out.println(isEqual.test(arr[2]));

        //and()
        Predicate<Integer> and1=(a)->a>5;
        Predicate<Integer> and2=(a)->a<10;
        System.out.println( and1.and(and2).test(5));

        //or
        Predicate<Integer> or1=(a)-> a<5&&a>1;
        Predicate <Integer> or2=(a)-> a!=3;
        System.out.println(or1.and(or2).test(2));

        //Negate()
        Predicate<String> str=(a)-> a.compareTo("Think")==0?true:false;
        System.out.println(    str.negate().test("Thin"));


    }
}
