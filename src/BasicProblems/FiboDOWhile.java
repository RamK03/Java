package BasicProblems;

public class FiboDOWhile {

    void calcii(int n){
        int num1=0;
        int num2=1;
        int range=0;
        int sumRes=0;
        System.out.print(num1+" "+num2);
        do{
           sumRes=num2+num1;
           System.out.print(" "+sumRes);
           num1=num2;
           num2=sumRes;
           range++;
        }while(range<=n);
    }
    public static void main (String []args){
        FiboDOWhile fd =new FiboDOWhile();
        //fd.calcii(10);
    }
}
