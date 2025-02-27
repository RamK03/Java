package BasicProblems;

public class RecursionWithFactorial {
    int  fact(int num){
        if(num==1)
            return 1;
        return num*fact(num-1);
    }
    public static void main (String []args){
        RecursionWithFactorial rc = new RecursionWithFactorial();
       System.out.println( rc.fact(5));
    }
}
