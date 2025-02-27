package BasicProblems;

public class SumOfDigits {
    void sum(int n){
        int sumRes=0;
        int temp;
        while(n!=0){
            temp=n%10;
            sumRes+=temp;
            n/=10;
        }
        System.out.println(sumRes);
    }
    public static void main(String []args){
        SumOfDigits sm= new SumOfDigits();
        sm.sum(1232);

    }
}
