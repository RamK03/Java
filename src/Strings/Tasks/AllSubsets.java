package Strings.Tasks;

public class AllSubsets
{

    static void find(String s)
    {
        int len=s.length();
        int count= (len*(len+1))/2;
        int arrCount=0;
        String []arr=new String[count];

        for(int i=0;i<len;i++)
        {

            for(int j=i;j<len;j++)
            {
                        arr[arrCount++] = s.substring(i,j+1);
            }
        }
        for(String r:arr)
        {
            System.out.println(r);
        }
    }
    public static void main(String []a)
    {
         find("Rantr");
    }
}
