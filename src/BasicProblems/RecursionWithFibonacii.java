package BasicProblems;

public class RecursionWithFibonacii {

   static int n1=0;
     static int n2=1;
    int fibo(int sumRes,int range,int i){

        i++;
        sumRes=n1+n2;
        n2=n1;
        n1=sumRes;
        System.out.print(" "+sumRes);
        if(range==i)
        {
            return 0;
        }
        else {
         //   System.out.println(sumRes);
            return fibo(sumRes, range, i);
        }
    }

    public static void main(String []args){
        RecursionWithFibonacii fc= new RecursionWithFibonacii();
        System.out.print(n1);
        fc.fibo(0,10,0);
    }
}
