package Strings;

import java.util.StringTokenizer;

public class StringTokens
{
    public static void main(String[] args)
    {
        String s= "Ram,divakar,gopi";
        StringTokenizer sc= new StringTokenizer(s,"a");

        //nextElement()
        System.out.println(sc.nextElement());

        //countTokens()
        System.out.println(sc.countTokens());

        //hasMoreElements()
        System.out.println(sc.hasMoreElements());

        //hasMoreTokens()
        System.out.println(sc.hasMoreTokens());

        //nextToken()
        System.out.println(sc.nextToken());

        System.out.println(sc.nextElement());
        System.out.println(sc.nextElement());







        // Declare a double value
        // representing the distance
        double d = 1500.75;

        // Declare a string value
        // representing the unit of measurement
        String s4 = "kilometers";

        // Correct the argument order to match the format specifiers
        String res = String.format("%1$,6.1f %2$s", d, s4);
        String f=
                """
                        "a":2
                        "b":1
                        f
                        
                        """;
        System.out.println(f);




    }
}
