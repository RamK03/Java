package Strings.Tasks;

public class SwappingWithoutThirdVariable
{
      void swapping1()  {
            String str1 = "good";
            String str2 = "morning";

            str1 = str1 + str2; // "goodmorning"
            str2 = str1.replaceFirst(str2, ""); // Remove "morning", str2 = "good"
            str1 = str1.replaceFirst(str2, ""); // Remove "good", str1 = "morning"

            System.out.println("Str1 is " + str1);
            System.out.println("Str2 is " + str2);
        }
    void swapping2()
    {
        String str1="good";
        String str2="morning";

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("Str1 is "+str1);
        System.out.println("Str2 is "+str2);
    }


    public static void main(String[] args)
    {
        SwappingWithoutThirdVariable mn=new SwappingWithoutThirdVariable();
       mn.swapping1();

    }
}
