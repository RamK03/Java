package Strings.Tasks;

import java.util.Arrays;

public class LargestAndSmallestWord
{
     String s="largest word present in the string";
    String largest="",smallest=s;

     int  greater(String s1,String s2)
    {
        int len1=Math.max(s1.length(),s2.length());
        int len=Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++)
        {
            if(s1.charAt(i)>s2.charAt(i))
            {
                return 1;
            }
            else if(s1.charAt(i)==s2.charAt(i))
            {
                return 0;
            }

        }
        return 0;
    }

     void finder(String s,String largest,String smallest)
    {
        if(s.length()>largest.length())
        {
            this.largest=s;
        }
        else if(s.length()==largest.length())
        {
            this.largest=greater(s,largest)>=0?s:largest;
        }

         if(s.length()<smallest.length())
        {
            this.smallest=s;
        }
        else if(s.length()==smallest.length())
        {
            this.smallest=greater(s,smallest)<=0?s:smallest;
        }
    }

     void action(String s)
    {

        int len=s.length();
        String opt="";
        int k=0,l=0,j=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==' ')
            {
                l=i;
                opt=s.substring(k,l);
                finder(opt,largest,smallest);
                k=l+1;
                j++;

            }
            else if(i==len-1)
            {
                l=i+1;
                opt=s.substring(k,l);

            }
        }
        System.out.println("Largest word is "+largest);
        System.out.println("smallest word is "+smallest);
    }
    public static void main(String[] args)
    {
        LargestAndSmallestWord mc=new LargestAndSmallestWord();
        mc.action(mc.s);

    }
}
