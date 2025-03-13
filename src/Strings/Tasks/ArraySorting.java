package Strings.Tasks;
import java.util.*;
public class ArraySorting
{

    static void sorting(String [] s1)
    {
        int len=s1.length;

        String temp="";
        System.out.println(Arrays.toString(s1));
        for(int i=2;i<len-3;i++)
        {
            for(int j=i+1;j<len-2;j++)
            {
                if(greaterString(s1[i],s1[j]))
                {
                    temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(s1));
    }

    static boolean  greaterString(String s1,String s2)
    {
        int len1=Math.max(s1.length(),s2.length());
        int len2=Math.min(s1.length(),s2.length());
        int k=0;

        for(int i=0;i<len2;i++)
        {
            if(s1.charAt(i)<s2.charAt(i))
            {
                return true;
            }
            else if(s1.charAt(i)>s2.charAt(i))
            {
                return false;
            }
        }

        return len1>len2;


    }
    public static void main(String args[])
    {

        String []s={"Hardships","often", "prepare", "ordinary", "people", "for", "an", "extraordinary", "destiny","motivate","string"};
        sorting(s);
    }
}
