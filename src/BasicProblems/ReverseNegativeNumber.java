package BasicProblems;

import java.util.Scanner;
public class ReverseNegativeNumber {

    int reversedNumber(int num)
    {
        int reverse=0;
        boolean isNumNegative=num<0?true:false;
        if(isNumNegative)
        {
            num=num*-1;
        }
        while(num>0) {
            reverse = (reverse * 10 + (num % 10));
            num /= 10;
        }
        return isNumNegative?reverse*-1:reverse;
    }


    public static void main (String [] args) {
        ReverseNegativeNumber rn=new ReverseNegativeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You want to reverse");
        int num = sc.nextInt();
        System.out.println( rn.reversedNumber(num));
    }
}