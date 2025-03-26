package OOPS;
import java.util.Scanner;

class Shapes
{
    int breadth=23;
    int length=45;
    int side=4;
    void area()
    {

    }
}

class Triangle extends Shapes
{
    void area()
    {
        double height=super.length;
        double area=(1/2)*super.breadth*height;
        System.out.println("Area Of Triangle "+area);
    }
}

class Square extends Shapes
{
    void area()
    {
        double area =super.side*super.side;
        System.out.println("Area of the Square "+area);
    }
}

class Rectangle extends Shapes
{
    void area ()
    {
        double area =super.length*super.breadth;
        System.out.println("Area of the Rectangle "+area);
    }
}

public class AreaCalculation
{
    static void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your Shape");
        System.out.println();
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Triangle");
        System.out.println();
        System.out.println("Enter Your Option");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
                Shapes rectangle_obj=new Rectangle();
                rectangle_obj.area();
                break;

            case 2:
                Shapes square_obj=new Square();
                square_obj.area();
                break;

            case 3:
                Shapes triangle_obj=new Triangle();
                triangle_obj.area();
                break;

            default:
                System.out.println("Invalid Shape");
                System.out.println("Enter correct Shape ");
                menu();
        }
    }
    public static void main(String args[])
    {
        menu();
    }
}
