package Strings.Tasks;

import java.util.Arrays;

public class Palindrome
{
    void reverseMethod()
    {
        String s="aaba";
        StringBuffer sc= new StringBuffer(s);
        StringBuffer sr= new StringBuffer();
        sr=sc.reverse();
        System.out.println(sr);
        if(sc.equals(sr))
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

        String s="Kayak";
        int len=s.length();
        char [] c1=s.toCharArray();
        char c= c1[0];
        for(int i=0;i<s.length()-1;i++)
        {
            c1[i]=c1[--len];
        }
        c1[s.length()-1]=c;

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
