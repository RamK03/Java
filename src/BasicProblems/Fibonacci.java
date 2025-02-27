package BasicProblems;

public class Fibonacci {
    void fibonaciiCal(int n){
        int n1=0;
        int n2=1;
        int fibo=0;
        int range =n;
        System.out.print(n1+" "+n2);
        for(int i=2;i<=range;i++){
            fibo=n1+n2;
            n2=n1;
            n1=fibo;
            System.out.print(" "+fibo);
        }
    }

    public static void main (String [] args){
        Fibonacci fb=new Fibonacci();
        fb.fibonaciiCal(10);

    }

}
