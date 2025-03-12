package Strings.Tasks;

import java.util.Arrays;

public class Palindrome
{
   static void reverseMethod()
    {
        String s="aaba";
        StringBuffer sr =new StringBuffer(s).reverse();
        if(s.contentEquals((sr)))
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String[] args)
    {
        reverseMethod();
        String s="Kayak";
        int len=s.length();
        char [] c1=s.toCharArray();
        char c= c1[0];
        for(int i=0;i<s.length()-1;i++)
        {
            c=c1[i];
            c1[i]=c1[--len];
            c1[len]=c;

        }
        System.out.println(Arrays.toString(c1));

        if(s.equalsIgnoreCase(String.valueOf(c1)))
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }


    }
}
