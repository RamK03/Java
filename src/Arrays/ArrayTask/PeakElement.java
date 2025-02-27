package Arrays.ArrayTask;

public class PeakElement {



        public int peakElement(int[] arr)
        {
            int peakElement=0;

            for(int i=0;i<arr.length;i++)
            {
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

            }

            return peakElement;
        }

        public static void main(String args[])
        {
            PeakElement sc= new PeakElement();
            int []arr= {1,2,3,5,4,2};
            int result=sc.peakElement(arr);
            System.out.println(result);
            boolean boolResult=result!=0;


            System.out.println(boolResult);

        }


}
