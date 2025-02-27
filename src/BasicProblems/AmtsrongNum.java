package BasicProblems;

import java.util.Scanner;

public class AmtsrongNum {

    void findAmstrongNum(int num){
        int count=0;
        int original=num;
        int n=num;
        while(n>=1){
            n/=10;
            count++;
        }
        int sumOfNum=0;
        int temp;

        for(int i=1;1<=num;i++){
            temp=num%10;
            sumOfNum+=(int)Math.pow(temp,count);
            num/=10;

        }
        if(original==sumOfNum){
            System.out.println(original+" is Amstrong Number");
        }else    System.out.println(original+" is not an Amstrong Number");

    }
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        AmtsrongNum am= new AmtsrongNum();
        System.out.println("Enter a number");
        int num=sc.nextInt();
        am.findAmstrongNum(num);
    }
}
