package Strings.Tasks;
import java.util.*;
public class ReverseOfTheString
{
   static String reverse1(String s)
    {
        char[] s1=s.toCharArray();
        char temp;
        int len=s1.length;

        for(int j=0;j<s.length()/2;j++)
        {
              temp=  s1[j];
              s1[j]=s1[--len];
              s1[len]=temp;
        }
        return String.valueOf(s1);
    }

    static String  reverse2(String s)
    {
        String reversed="";
        int len =s.length();
        for(int i=len-1;i>=0;i--)
        {
            reversed+=String.valueOf(s.charAt(i));
        }
        return reversed;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        System.out.println("The reversed String is "+reverse2(s));
        System.out.println( "The reversed String is "+reverse1(s));

    }
}
