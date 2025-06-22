package Collections.Tasks;

import java.util.*;

class Employee
{
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary,String department)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

    public String toString()
    {
        return id+"-"+name+"-"+salary+"-"+department;
    }
}

interface EmployeeFilter
{
    boolean test(Employee e);
}

public class ComparatorInterface
{
    public static void main(String[] args)
    {
        List<Employee> empList=new ArrayList<>();

        empList.add(new Employee(119,"Sarath",10000,"IT"));
        empList.add(new Employee(119,"Nisha",45000,"CSE"));
        empList.add(new Employee(119,"Balan",80000,"BIO-MEDICAL"));
        empList.add(new Employee(119,"Rohit",15000,"ECE"));
        empList.add(new Employee(119,"Lisa",98000,"DATA SCIENCE"));
    }

}
