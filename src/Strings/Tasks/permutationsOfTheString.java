package Strings.Tasks;

import java.util.Arrays;

public class permutationsOfTheString
{
    static String swap(String s,int start,int end)
    {
        char [] c=s.toCharArray();
        char ch;
        ch=c[start];
        c[start]=c[end];
        c[end]=ch;

        return String.valueOf(c);

    }

   static  void permute(String str,int start, int end)
    {
        if(start==end-1)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=start;i<end;i++)
            {
              str=  swap(str, start, i);
              permute(str,start+1,end);
              swap(str, start, i);
            }
        }

    }

    public static void main(String[] args)
    {
        String s="ABC";
        int len=s.length();
        permute(s,0,len);
    }
}
