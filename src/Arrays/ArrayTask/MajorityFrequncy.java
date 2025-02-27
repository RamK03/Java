package Arrays.ArrayTask;

public class MajorityFrequncy {
    public int majorityWins(int arr[], int n, int x, int y) {
        int count_X=0,count_Y=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count_X++;
            }
            else if(arr[i]==y)
            {
                System.out.println(i);
                count_Y++;
            }
        }
        System.out.println(count_X);
        System.out.println(count_Y);

        if(count_X>count_Y)
        {
            return x;
        }
        else if(count_X==count_Y)
        {
            if(x<y)
            {
                return x;
            }else
            {
                return y;
            }
        }
        else
        {
            return y;
        }
    }

    public static void main(String[]t)
    {
        MajorityFrequncy sc= new MajorityFrequncy();
        int []arr={98, 99, 39 ,12 ,0 ,36, 15, 47, 79, 62, 64};
        System.out.println(sc.majorityWins(arr,arr.length,64,5));
    }
}
