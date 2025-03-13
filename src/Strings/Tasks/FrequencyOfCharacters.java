package Strings.Tasks;

public class FrequencyOfCharacters
{
   void findingFrequencyMethod1()
   {
       String s="permutations of the string ";
       char []c=s.toCharArray();
       int count =1;
       for(int i=0;i<s.length();i++)
       {
           count=1;
           if(c[i]=='0'||c[i]==' ')
           {
               continue;
           }
           for(int j=i+1;j<s.length();j++)
           {
               if(c[i]==c[j])
               {
                   count+=1;
                   c[j]='0';

               }
           }
           System.out.println(c[i]+" occured "+ count+" times");
       }
   }

  static void findingFrequencyMethod2()
   {
       String s="permutations of the string ";
       int []frequency=new int [256];
       for(char c:s.toCharArray())
       {
           frequency[c]++;
       }
       System.out.println("Character frequencies of the String are");
       for(int i=0;i<frequency.length;i++)
       {
           if(frequency[i]!=0)
           {
               System.out.println((char) i + " occured " + frequency[i] + " times");
           }
       }

   }
    public static void main(String[] args)
    {
        findingFrequencyMethod2();

     }
}








