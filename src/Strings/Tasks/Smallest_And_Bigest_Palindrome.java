package Strings.Tasks;

public class Smallest_And_Bigest_Palindrome
{
    String biggest="",smallest="";
    void usingInbuiltMethod(String str)
    {
      this.smallest=str;
      boolean res=false;
        String temp="";
        int k=0,l=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                temp=str.substring(k,i);
                k=i+1;
                res= ispalindrome(temp);
                set(res,temp);
            }
            else if (i==str.length()-1)
            {
                temp=str.substring(k,i+1);
                res= ispalindrome(temp);
                set(res,temp);
            }
        }
        System.out.println("Largest Palindrome is "+ this.biggest);
        System.out.println("Smallest palindrome is "+this.smallest);
    }

    void set(boolean res,String temp)
    {
        if( res && temp.length()> this.biggest.length())
        {
            this.biggest=temp;
        }
        else if(res && temp.length()== this.biggest.length())
        {
            this.biggest=temp.compareToIgnoreCase( this.biggest)>=0?temp: this.biggest;
        }

        if( res && temp.length()<this.smallest.length())
        {
            this.smallest=temp;
        }
        else if(res && temp.length()==this.smallest.length())
        {
            this.smallest=temp.compareToIgnoreCase(this.smallest)<=0?temp:this.smallest;
        }
    }

    boolean ispalindrome(String s)
    {
        StringBuilder s1=new StringBuilder(s);
        return  s1.toString().contentEquals(s1.reverse());
    }

    public static void main(String[] args)
    {
        Smallest_And_Bigest_Palindrome obj= new Smallest_And_Bigest_Palindrome();
        String s="wow you own kayak";
        obj.usingInbuiltMethod(s);


    }
}
