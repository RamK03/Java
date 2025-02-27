package Strings.Tasks;
import java.util.Arrays;

public class Anagram
{
    public static void main(String[] args)
    {
        String s1="grab";
        String s2="brg";

        if(s1.length()!=s2.length())
        {
            System.out.println("It is not an Anagram");
        }
        else
        {
            char [] s3=s1.toCharArray();
            char [] s4=s2.toCharArray();
            Arrays.sort(s3);
            Arrays.sort(s4);
            System.out.println(Arrays.equals(s3,s4)?"The String is Anagram":"The String is not an Anagram");
        }
    }
}
