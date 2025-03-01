package Strings.Tasks;
import java.util.*;
public class LongestSequnceInString
{
    String  substring(String s1, String s2)
    {
        int minLength=Math.min(s1.length(),s2.length());
        for(int i=0;i<minLength-1;i++)
        {

                if(s1.charAt(i)!=s2.charAt(i))
                {
                    return s1.substring(0,i);
            }
        }
        return s1.substring(0,minLength);
    }
    void longestSequence(String s)
    {
        int len=s.length();

        String lrs= "";
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                String res= substring(s.substring(i,len),s.substring(j,len));
                if(lrs.length()<res.length())
                {
                    lrs=res;
                }
            }
        }
        System.out.println("Longest subsequence in the String is "+lrs);


    }
    public static void main(String[] args)
    {
        LongestSequnceInString n =new LongestSequnceInString();
        n.longestSequence("acbdfghybdf" );


    }
}
