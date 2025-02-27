package Arrays.ArrayTask;

public class SolutionSubset
{
        public boolean isSubset(int a[], int b[])
        {
            boolean []c=new boolean[b.length];
            boolean[] d=new boolean[a.length];
            for(int i=0;i<b.length;i++)
            {

                for(int j=0;j<a.length;j++)
                {

                    if(d[j]==true)
                    {
                        continue;
                    }
                    if(b[i]==a[j])
                    {
                        c[i]=true;
                        d[j]=true;
                       break;
                    }


                }
            }

            for(int i=0;i<c.length;i++)

                if(c[i]==false)
                    return false;
            return true;
        }
    public static void main(String[] args) {
        SolutionSubset sc=new SolutionSubset();
        int []a={11, 7, 1, 13, 21, 3, 7, 3};
        int []b={11, 3, 7, 1, 7};
        System.out.println( sc.isSubset(a,b));
    }
    }
