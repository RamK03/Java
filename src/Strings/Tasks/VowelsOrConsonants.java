package Strings.Tasks;

public class VowelsOrConsonants
{
    public static void main(String[] args)
    {
        String s= "Program to count the total number of characters in a string";
        s.toLowerCase();
        int vCount=0,cCount=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='a'||s.charAt(i)=='r'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vCount++;
            }
            else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                cCount++;
            }
        }
        System.out.printf("""
                Consonant count = %d
                Vowel count =%d
               """,cCount,vCount);

    }
}
