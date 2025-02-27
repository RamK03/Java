package Strings.StringMethods;

public class Part1
{
    public static void main(String[] args)
    {

        String s1= " Ram,is, a Hero ";
        String s3=new String("Ram");
        String s2=s3.intern();// intern()

        //length()
        System.out.println(s1.length());

        //chartAt()
        System.out.println(s1.charAt(2));

        //substring()
        System.out.println(s1.substring(0,2));

        //concat()
        System.out.println(s1.concat(" Hi"));

        //indexOf()
        System.out.println(s1.indexOf("R"));

        //indexOf()
        System.out.println(s1.indexOf("a",2));

        //lastIndexOf()
        System.out.println(s1.lastIndexOf("m"));

        //equals()
        System.out.println(s3.equals(s2));

        //contentEquals()
        System.out.println(s1.contentEquals(s3));

        //equalsIgnoreCase() && equals()
        s2=s3.toUpperCase();
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s3.equals(s2));

        //compareTo()
        System.out.println((s2).compareTo(s3.toUpperCase()));

        //compareToIgnoreCase()
        System.out.println(s2.toLowerCase().compareToIgnoreCase(s3));

        //trim()
        System.out.println(s1);
        System.out.println(s1.trim());

        //replace() && replaceAll()
        System.out.println(s1.replaceFirst("a","A"));
        System.out.println(s2.replace('a','A'));
        System.out.println(s2.replaceAll("a","r"));

        //contains()
        System.out.println(s2.contains("R"));

        //toCharArray()
        char []ch=s2.toCharArray();
        System.out.println(ch);

        //startsWith()
        System.out.println(s1.startsWith(" "));

        //format()
        System.out.println(String.format("%1$d, %2$d",1000,29));

        //split()
        String []s7=s1.split(",");
        for(String s8:s7)
        {
            System.out.println(s8);
        }

        //join()
        System.out.println(String.join(" < ",s7));


    }
}
