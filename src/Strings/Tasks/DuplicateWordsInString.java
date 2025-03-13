package Strings.Tasks;


public class DuplicateWordsInString
{
    void duplicate()
    {
        String s="big black bug bit a big black dog on his big black nose";
        String [] s1=new String [s.length()];
        int k=0,l,m=0;
        for(int i=0;i<s.length();i++)
        {
                if(s.charAt(i)==' ')
                {
                    l=i;
                    s1[m++] = s.substring(k,l);
                    k=l+1;
                }else if(i==s.length()-1)
                {
                    l=i+1;
                    s1[m++] = s.substring(k,l);
                }

        }

        String []s2=new String[s1.length];
        for(int i=0;i<s1.length-1;i++)
        {
            if(s1[i]==null)
                continue;
            for(int j=i+1;j<s1.length-1;j++)
            {
                if(s1[i].equals(s1[j]) )
                {
                    s2[i]=s1[i];
                    s1[j]=null;

                }
            }
        }
        System.out.println("Duplicate words in the String are ");
        for(String r:s2)
        {
            if(r!=null) {
                System.out.println(r);
            }
        }
    }
    public static void main(String[] args)
    {
        DuplicateWordsInString mc=new DuplicateWordsInString();
        mc.duplicate();

    }
}
