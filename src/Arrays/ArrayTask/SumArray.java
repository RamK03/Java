package Arrays.ArrayTask;

public class SumArray {
    public static void main(String[] args) {
        int [] arr=java.util.stream.IntStream.range(1,6).toArray();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
