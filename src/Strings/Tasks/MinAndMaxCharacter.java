package Strings.Tasks;

public class MinAndMaxCharacter
{

   static void minAndMax(char[] s)
    {
        int count=1;
        int max=0,min=s.length;
        char maxChar=' ',minChar=' ';
        for(int i=0;i<s.length;i++)
        {
            count=1;
            for(int j=i+1;j<s.length;j++)
            {
                if(s[i]==s[j] && !(s[i]=='0') && !(s[i]==' '))
                {
                    count ++;
                    System.out.println(s[i]+" "+s[j]+count);
                    s[j]='0';
                }

            }
            if(max<count)
            {
                max=count;
                maxChar=s[i];
            }
            if(min>count && count!=0)
            {
                min=count;
                minChar=s[i];
            }
        }
        System.out.println("Max Character occured in the String is "+maxChar);
        System.out.println("Min Character occured in the String is "+minChar);
    }
    public static void main(String[] args)
    {
        String s="grass is greener on the other side";
        minAndMax(s.toCharArray());
    }
}
