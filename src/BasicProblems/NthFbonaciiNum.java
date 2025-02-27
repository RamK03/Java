package BasicProblems;

import java.util.Scanner;
public class NthFbonaciiNum {
void findFibo(int n){
    int n1=0;
    int n2=1;
    int sumRes=0;
    if(n==1) {
        System.out.printf("%dth Fibonacii number is 0",n);
    }
    else if(n==2){
        System.out.printf("%dst Fibonaciinumber is 1",n);
    }else{
        for (int i = 3; i <= n; i++) {
            sumRes = n1 + n2;
            n1 = n2;
            n2 = sumRes;
            if (i == n) {
                System.out.printf("%dth Fibonacii number is %d",n,sumRes);
            }
        }
    }
}
public static void main(String []args ){
    NthFbonaciiNum fb= new NthFbonaciiNum();
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number you want");
    int num=sc.nextInt();
    fb.findFibo(num);
}

}
