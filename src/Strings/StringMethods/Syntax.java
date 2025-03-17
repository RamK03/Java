package Strings.StringMethods;

public class Syntax
{
    public static void main (String []args)
    {
        //char array to String
        char []s1={'0',65535,43,22,23,'a','a'};
        String s=new String(s1);
        System.out.println( s.indent(0));

        System.out.println( s.replace("a","r"));
        //Byte array to String
         byte[]arr= {97,98,99,100};
         String s2=new String(arr,0,2).toUpperCase();
         System.out.println(s2);

         //StringBuffer to String
        StringBuffer sc=new StringBuffer("2kjskn");
        String s5= new String(sc);
        System.out.println(s);

        String t="ram";
        String h="ram";
        System.out.println(t==h);

        String r=new String ("ram");
        System.out.println(t==r);


    }
}
