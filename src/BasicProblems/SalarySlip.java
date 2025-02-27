package BasicProblems;

import java.util.Scanner;

public class SalarySlip
{
    static Scanner sc = new Scanner(System.in);
    static  float basicSalary;


    float esi()
    {
        float esiAmount=((SalarySlip.basicSalary/100)*0.75f);
        return esiAmount;
    }

    float pf()
    {
        float pfAmount=(SalarySlip.basicSalary/100)*12f;
        return pfAmount;
    }

    float deduction()
    {
        float deductions=esi()+pf();
        return deductions;
    }

    float allowance()
    {
        float allowances=(SalarySlip.basicSalary/100)*30f;
        return allowances;
    }

    float gross()
    {
        float grossSalary=basicSalary+allowance();
        return grossSalary;
    }

    float net()
    {
        float netSalary=gross()-deduction();
        return netSalary;
    }

    void slipPrint()
    {
        System.out.println("HELLO EMPLOYEE");
        System.out.println("Enter your Basic pay");
        SalarySlip.basicSalary=sc.nextInt();

        System.out.println("Your Gross Salary is "+gross());
        System.out.println("Your Deductions is "+deduction());
        System.out.println("Your Net Salary is "+net());
    }




    public static void main (String []args){
    SalarySlip s= new SalarySlip();
    s.slipPrint();

    }
}
