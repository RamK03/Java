package Strings.Tasks;

public class LowerCasewithUpperCase
{
   static  StringBuilder change(StringBuilder srg,int len, int index)
    {
        if(Character.isLowerCase(srg.charAt(index)))
        {
            srg.setCharAt(index,Character.toUpperCase(srg.charAt(index)));

        }
        else if(Character.isUpperCase(srg.charAt(index)))
        {
            srg.setCharAt(index,Character.toLowerCase(srg.charAt(index)));
        }
        return srg.length()-1==index?srg:change(srg,len,index+1);
    }

    public static void main(String[] args)
    {
        String s="tHE MATCH WAS ABANDONED.dUE TO RAIN";

        int len = s.length();

        StringBuilder srg= new StringBuilder(s);
        System.out.println(change(srg,len,0));


    }
}

