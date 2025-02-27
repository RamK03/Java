package Arrays.ArrayTask;

public class LargestNumber {
    public static void main(String[]args)
    {
        int []arr={4,46,43,5,66,432,43,4,4,44,3,3};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            max=arr[i]>max?arr[i]:max;
        }
        System.out.println("maximum value in the array = "+max);

    }
}
