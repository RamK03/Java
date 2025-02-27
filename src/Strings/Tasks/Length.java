package Strings.Tasks;

public class Length
{
    public static void main (String []a)
    {
        String s="The best of both worlds";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(s.length());
    }
}
