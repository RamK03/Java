package Arrays.ArrayTask;

import java.util.Arrays;

public class SolutionSubset1 {

        public boolean isSubset(int a[], int b[])
        {
            int i=0,j=0;
            Arrays.sort(a);
            Arrays.sort(b);

            while(i<b.length&&j<a.length)
            {
                System.out.println(b[i]+" "+a[j]);
                if(b[i]==a[j])
                {
                    i++;
                }
                j++;
            }
            System.out.println(i);
            System.out.println(b.length-1);
            return i==b.length;
        }

    public static void main(String[] args) {
        SolutionSubset1 sc=new SolutionSubset1();
        int []a={11 ,7 ,1 ,13 ,21 ,3 ,7 ,3};
        int []b={11 ,3 ,7 ,1 ,7};
        System.out.println(sc.isSubset(a,b));
    }

}
