package Strings.Tasks;

public class RotationOfString
{
   static  String isRotation(String s1,String s2)
    {
        String res=s1+s1;

        if(res.contains(s2))
        {
          return "String 2 is the rotation of String 1";
        }
        else
        {
            return "String 2 is not the rotation of String 1";
        }
    }
    public static void main(String args[])
    {
        String s1= "abcde";
        String s2="deabc";
        System.out.println( s1.length() != s2.length() ? "String 2 is not the rotation of String 1" : isRotation(s1, s2));


    }
}
