package Arrays.ArrayMethods;
import java.util.Arrays;
import java.util.List;

public class ArrayParallelPrefixMethod {
    void dummy() {
        long b = 4848488747474777L;
        float c = 3.994994999f;
        double d = 867.3994941234567899;
        byte ab = 23;
        byte ac = 44;
        int res = ab + ac;
        short b1 = 23;
        short a1 = 44;
        int res2 = ab + ac;
        byte a2 = 44;
        short b3 = 45;
        int res3 = a2 + b3;
        System.out.println(res3);
        System.out.println(res2);
        System.out.println(res);
        System.out.println();
        System.out.println();


        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int[] arr = java.util.stream.IntStream.range(1, 10).toArray();

        Arrays.parallelSetAll(arr, a -> 3 - 1);
        System.out.println(Arrays.toString(arr));
        Arrays.parallelPrefix(arr, (a, x) -> a * x);
        System.out.println(Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr5 = {1, 2, 3, 4, 5};
        int[] arr7 = {1, 2, 3, 4, -5};

        Arrays.parallelSort(arr7);
        System.out.println(Arrays.toString(arr7));
        List<Integer> as = (Arrays.asList(arr5));
        System.out.println(as);

    }

    public int[] minAnd2ndMin(int[] arr) {
        int[] res = new int[2];
        res[0] = arr[0];
        res[1] = arr[1];
        int temp = 0;
        int j = 2;


        for (int i = 0; i < arr.length; i++) {
            System.out.println("hi" + res[0] + " " + res[1]);
            if (res[0] > arr[i]) {
                res[0] = arr[i];
            }

            if (res[1] > res[0] && res[1] > arr[i] && res[1] != res[0]) {
                res[1] = arr[i];
            }
            while (res[0] == res[1] && j < arr.length) {
                res[1] = arr[j];
                j++;

            }
            if (res[0] > res[1]) {
                temp = res[0];
                res[0] = res[1];
                res[1] = temp;

            }
            System.out.println(res[0] + " " + res[1]);
        }
        System.out.println(Arrays.toString(res));
        if (res[0] < res[1]) {
            return res;
        } else {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
    }

    public void swapKth(List<Integer> arr, int k) {
        int l = 0, m = 0, n = 0;

        l = k - 1;
        m = arr.size() - k;
        n = arr.get(l);
        arr.set(l, arr.get(m));
        arr.set(m, n);
        System.out.println(arr.size());
        System.out.println(m);
        System.out.println(arr);
    }


    int missingNumber2(int arr[]) {
        Arrays.sort(arr);
        int missingElement=0;
        System.out.println(Arrays.toString(arr));
        if(arr.length<2)
        {
            missingElement=arr[0]+1;
        }
        else{
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+" "+i);
                if(arr[i]!=i+1)
                {
                    System.out.println(arr[i]+" "+i);
                    missingElement=arr[i]+1;
                    break;
                }

            }


        }
        return missingElement;
    }
    int missingNumber1(int arr[]) {
        Arrays.sort(arr);
        int missingElement=0;
        System.out.println(Arrays.toString(arr));
        if(arr.length<2)
        {
            missingElement=arr[0]+1;
        }
        else{
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+" "+i);
                if(arr[i]==i+1)
                {

                }
                else{
                    missingElement=i+1;
                }
            }


        }
        return missingElement;
    }

    int missingNumber(int arr[]) {
        Arrays.sort(arr);
        int n=arr[arr.length-1];
        int missingElement=0;
        int sum_n=(n*(n-1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

        }
        System.out.println(sum_n);
        System.out.println(sum);
        missingElement=sum-sum_n;
        return missingElement;
    }
    public static void main(String[] args) {
        ArrayParallelPrefixMethod sc = new ArrayParallelPrefixMethod();
        int []arr={2 ,1};
        int []arr1={2  ,5 ,1 ,3};
        System.out.println(sc.missingNumber(arr));
       // System.out.println(sc.missingNumber(arr1));

     /*   List<Integer> arr = new ArrayList<>(10);

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        sc.swapKth(arr, 3);*/

    }
}

    // Second version (varargs)




