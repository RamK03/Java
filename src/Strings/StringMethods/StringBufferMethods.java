package Strings.StringMethods;

public class StringBufferMethods
{
    public static void main(String[] args)
    {
        StringBuffer sc= new StringBuffer();

        //append()
        sc.append("Cheetah is Faster than Tiger");
        System.out.println(sc);

        //length()
        System.out.println(sc.length());

        //capacity()
        System.out.println(sc.capacity());

        //charAt()
        String s= String.valueOf(sc.charAt(5));
        System.out.println(s);

        //delete()
        System.out.println(sc.delete(0,1));

        //deleteCharAt()
        System.out.println(sc.deleteCharAt(5));

        //insert()
        System.out.println(sc.insert(5,8));

        //reverse()
        System.out.println(sc.reverse());
        System.out.println(sc.reverse());

        //replace()
        System.out.println(sc.replace(3,4,"a"));

        //getClass() && getName();
        System.out.println((sc.getClass().getName()));

            //chars()
        System.out.println(sc.chars());

        //getChars()
        char [] s7=new char[5];
        sc.getChars(2,7,s7,0);
        System.out.println(s7);

      //setCharAt()
        sc.setCharAt(6,'y');
        System.out.println(sc);

        //trimToSize()
        System.out.println(sc.capacity());
        sc.trimToSize();
        System.out.println(sc.capacity());
        System.out.println(sc);






    }
}
