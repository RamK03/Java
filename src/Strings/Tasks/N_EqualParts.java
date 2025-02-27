package Strings.Tasks;

public class N_EqualParts
{
    void dividing(int n)
    {
        String s = "Ram is a Software Engineer";
        int chars = s.length() / n;
        int s2 = 0;

        char[] crr = s.toCharArray();
        String[] arr = new String[n];

        if ((s.length() % n )!= 0)
        {
            System.out.println("String cannot be divided into equal parts");
        }
        else
        {
                for (int i = 0; i < n; i++)
                {
                    for (int j = 0; j < chars; j++)
                    {
                        if (arr[i] == null)
                        {
                            arr[i] = String.valueOf(crr[s2++]);
                        }
                        else
                        {
                            arr[i] += String.valueOf(crr[s2++]);
                        }
                    }
                }
            for(String s5:arr)
                System.out.println(s5);
        }

    }

    public static void main(String[] args)
    {
        N_EqualParts nc=new N_EqualParts();
        nc.dividing(2);
    }
}

