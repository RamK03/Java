package OOPS;

public class Encapsulation
{
    private int balance=7000;

    public int get_Balance()
    {
        return balance;
    }

    public void set_Balance(int balance)
    {
        this.balance=balance;
    }
}

class BalanceCheck extends Encapsulation
{
    public static void main(String[] args)
    {
        BalanceCheck mc=new BalanceCheck();
        System.out.println("Your Balance is "+mc.get_Balance());
        mc.set_Balance(50000);
        System.out.println("Your Balance is "+mc.get_Balance());
    }
}