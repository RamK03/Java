package Arrays.ArrayTask;

import java.util.Arrays;
class Solution {

    public int peakElement(int[] arr)
    {
        int peakElement=0;

        for(int i=0;i<arr.length;i++)

            if(i==arr.length-1)
            {
                if(arr[i]>arr[i-1]){
                    peakElement=arr[i];
                }
            }

            else if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
            {
                peakElement=arr[i];
            }




        return peakElement;
    }

    public static void main(String args[])
    {
        Solution sc= new Solution();
        int []arr={
                1, 2, 4, 5, 7, 8, 3};
        for(int a:arr)
        {
            System.out.println(a);
        }
        int result=sc.peakElement(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        boolean boolResult=result!=0;



        System.out.println(boolResult);

    }
}
