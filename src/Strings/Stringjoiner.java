package Strings;
import java.util.StringJoiner;
public class Stringjoiner
{

    public static void main(String[] args)
    {
        StringJoiner sc= new StringJoiner(" ");
        StringJoiner sc1= new StringJoiner(",");
        //add() and toString()
        sc.add("Ram").add("gopi").add("were");

        System.out.println(sc.toString());

        //setEmptyValue()
        System.out.println(sc1.setEmptyValue(".uuk"));

        //merge()
        System.out.println(sc1.merge(sc));
        // length()
        System.out.println(sc1.length());






    }
}
