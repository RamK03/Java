package Interface.Tasks;

 import java.util.*;

interface Payment
{
    void paymentProcess(double amount);
}

class CreditCard implements Payment
{
    double processingFee=0;
    double totalAmount=0;

    public void paymentProcess(double amount)
    {
        processingFee=((amount*2)/100);
        totalAmount=amount+processingFee;

        System.out.println("Proccesiing Fee = "+processingFee);
        System.out.println("Total Amount = "+totalAmount);
        System.out.println("Payment Successful using CreditCard");

    }
}

class Upi implements Payment
{
    double processingFee=0;
    double totalAmount=0;
    public void paymentProcess(double amount)
    {
        System.out.println("No Processing Fee");
        System.out.println("Total Amount = "+amount);
        System.out.println("Payment Successful using UPI");
    }
}

class PayPal implements Payment
{
    double processingFee=0;
    double totalAmount=0;
    public void paymentProcess(double amount)
    {
        processingFee=((amount*3)/100);
        totalAmount=amount+processingFee;
        System.out.println("Processing Fee = "+processingFee);
        System.out.println("Total Amount = "+totalAmount);
        System.out.println("Payment  Successful using PayPal");
    }
}
class PaymentProcessing
{
    void userMenu()
    {
        Payment obj;
        int userOption;
        Scanner sc= new Scanner (System.in);
        System.out.println("Payment Processing");
        System.out.println();
        System.out.println("Enter the Amount");
        double amount=sc.nextDouble();
        System.out.println();
        do
        {
            System.out.println("Payment options");
            System.out.println("1.Credit Card");
            System.out.println("2.UPI");
            System.out.println("3.PayPal");
            System.out.println();
            userOption=sc.nextInt();
            System.out.println();
            if(userOption==1)
            {
                obj=new CreditCard();
                obj.paymentProcess(amount);
            }
            else if(userOption==2)
            {
                obj=new Upi();
                obj.paymentProcess(amount);
            }
            else if(userOption==3)
            {
                obj=new PayPal();
                obj.paymentProcess(amount);
            }
            else
            {
                System.out.println("Invalid Payment Option");
            }
        }while(userOption<1&&userOption>3);
    }

    public static void main(String args[])
    {
        PaymentProcessing obj=new PaymentProcessing();
        obj.userMenu();
    }
}
