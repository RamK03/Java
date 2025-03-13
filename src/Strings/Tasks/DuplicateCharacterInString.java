package Strings.Tasks;

public class DuplicateCharacterInString
{
    public static void main(String[] args)
    {
        String s="minimum";
        char [] c=s.toCharArray();
        char [] duplicate=new char[s.length()];

       for(int i=0;i<c.length;i++)
       {
           for(int j=i+1;j<c.length-1;j++)
           {
              if(c[i]==c[j]&&c[i]!='0')
              {
                  duplicate[i]=c[i];
                  c[j]='0';
              }
           }
       }
        System.out.println("Duplicate elements in the String are ");
       for(char a:duplicate)
       {
           if(a!='\u0000')
           {
               System.out.println(a);
           }
       }
    }
}
