package BasicProblems;

import java.util.Arrays;
import java.util.Scanner;


public class NewProject
{
   static  Scanner sc=new Scanner(System.in);
   static NewProject nc = new NewProject();

   int menu()
   {
       int option;
       do {
           System.out.println("HELLO USER");
           System.out.println("1.Reversing a number");
           System.out.println("2.Factorial using Recursion");
           System.out.println("3.Factorial using Loop");
           System.out.println("4.Finding Fibonacii Series");
           System.out.println("5.find Largest  between 3 Numbers");
           System.out.println("6.Smallest among 3 numbers");
           System.out.println("7.Swapping two variables");
           System.out.println("8.Add three numbers");
           System.out.println("9.T o find Odd Numbers");
           System.out.println("10.To find Even Numbers");
           System.out.println("Choose your option");
           System.out.println();
            option = sc.nextInt();
       }while(option<1||option>10);

       if(option<1||option>10) {
           System.out.println("Your Entered wrong option");
           System.out.println(" Enter correct option");
       }

       return switchCall(option);


   }

   int numberReversing()
   {
       System.out.println("Enter the number you want to reverse");
       int num=sc.nextInt();
       int temp;
       int reversedNumber=0;
       for(int i=1;1<=num;i++)
       {
           temp=num/10;
           reversedNumber*=10+(temp);
           num/=10;

       }
       return reversedNumber;
   }
   double factUsingRecursion(double range)
   {
       if(range==1)
       {
           return 1;
       }
       else
       return range*(factUsingRecursion(range-1));
   }
   double factorialUsingLoop()
   {
       double factRes=1;
       System.out.println("Enter the range");
       double range=sc.nextDouble();
       for(int i=1;i<=range;i++)
       {

            factRes=factRes*i;

       }
       return factRes;
   }
   int[] fibonaciiSeries()
   {
       System.out.println("Enter the range");
       int range= sc.nextInt();
       int[] sumRes=new int [range];
        sumRes [0]=0;
        sumRes [1]=1;
        int res=0;
        int n1=0;
        int n2=1;

       for(int i=2;i<=range-1;i++)
       {
           res=n1+n2;
           sumRes[i]=res;
           n1=n2;
           n2=res;

       }
       return sumRes;
   }
   int largestNumber()
   {
        System.out.println("Enter 1st Number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int num3=sc.nextInt();
        int greater=0;

        if((num1<num2))
        {
            if(num2>num3)
            {
                greater=num2;

            }
            else
            {
                greater=num3;
            }
        }
        else if (num1>num3)
        {
            greater=num1;

        }else
        {
            greater=num3;
        }
       return greater;
    }
    int smallestNumber()
    {
        System.out.println("Enter 1st Number ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number ");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd Number ");
        int num3=sc.nextInt();
        int smallest=0;

        if(num1<num2)
        {
            if(num1<num3)
            {
                smallest=num1;
            }
            else
            {
                smallest=num3;
            }
        }
        else if (num2<num3)
        {
            smallest=num2;

        }else
        {
            smallest=num3;
        }
       return smallest;
    }
    int[] swapping()
    {
        System.out.println("Enter a Number a=");
        int a=sc.nextInt();
        System.out.println("Enter a Number b=");
        int b=sc.nextInt();
        int arr[]=new int[2];
        a=a+b;
        b=a-b;
        a=a-b;
        arr[0]=a;
        arr[1]=b;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        return arr;
    }
    int addThreeNumbers()
    {
        System.out.println("Enter 1st Number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int num3=sc.nextInt();
        int addResult=num1+num2+num3;
        return addResult;
    }
   int [] oddNumbers()
   {
       System.out.println("Enter the range");
       int range=sc.nextInt();
       int arr[]=new int [range];
       for(int i=0;i<=range-1;i++)
       {
           if(i%2!=0)
           {
               int j=0;
               arr[j]=i;
               j++;
           }
       }
       return arr;
   }
   int [] evenNumbers(){
       System.out.println("Enter the range");
       int range=sc.nextInt();
       int arr[]=new int[range];
       int j=0;
       for(int i=1;i<=range;i++)
       {
           if(i%2==0)
           {
               arr[j]=i;
               j++;
           }
       }
       return arr;
   }


   int switchCall(int option)
   {
       switch (option)
       {
           case 1:
               System.out.println("The reversed Numberis "+numberReversing());
               break;
           case 2:
               System.out.println("Enter range ");
               double range= sc.nextDouble();
               System.out.println("The Factorial of the given number is "+factUsingRecursion(range));
           case 3:
               System.out.println("The Factorial of the given number is"+factorialUsingLoop());
           case 4:
               System.out.println("The fibonacii series is "+ Arrays.toString(fibonaciiSeries()));
           case 5:
               System.out.println("The Largest number is "+largestNumber());
           case 6:
               System.out.println("The Smallest Number is "+smallestNumber());
           case 7:
               int arr[]=swapping();
               System.out.printf("The result after swapping a=%d \n b=%d",arr[0],arr[1]);
           case 8:
               System.out.println(addThreeNumbers());
           case 9:

                  System.out.println(Arrays.toString(oddNumbers()));
           case 10:
               System.out.println(Arrays.toString(evenNumbers()));
       }
       return 0;
   }

   public static void main(String [] args)
    {
        nc.menu();
    }
}
