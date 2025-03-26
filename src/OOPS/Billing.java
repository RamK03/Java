package OOPS;
//create a abstract class product with abstract methods as discount(),detail().
// create a sub-classes electronics and clothes which over-ride
//the parent class method and provide implementations.
import java.util.*;
abstract class Product
{
    abstract void detail();
    abstract double discount(double price);
}

class Electronics extends Product
{
    static Scanner sc=new Scanner(System.in);
    String productName;
    double price;
    static int c=0;
    static Electronics [] cart=new Electronics[50];
    Electronics [] products=new Electronics [5];
    String []review=new String [5];
    int k=0;

    Electronics(){}
    Electronics(String productName,double price,String review)
    {
        this.productName=productName;
        this.price=price;
        this.review[k++]=review;
    }


    void detail()
    {
        int l=1;
        double totalPrice=0;
        System.out.println("Your Products List-----------------------------");
        for(Electronics name:cart)
        {
            if(name==null)continue;
            System.out.println((l++)+".Name :"+name.productName+" Price : "+name.price);
            totalPrice+=name.price;
        }
        double discount=totalPrice-discount(totalPrice);
        System.out.println("Total price              = "+totalPrice);
        System.out.println("Discount                 ="+(totalPrice-discount));
        System.out.println("Final price               ="+discount);
    }

    void view()
    {

        products [0]=new Electronics("Ac",100000,"xxx");
        products [1]=new Electronics("Tv",10000,"xxx");
        products [2]=new Electronics("WM",15000,"xxxx");
        products [3]=new Electronics("Phone",10000,"xxxx");
        products [4]=new Electronics("Fan",2000,"xxx");

        int l=1;
        System.out.println("Electronics  List-----------------------------------");
        for(Electronics name:products)
        {
            System.out.println((l++)+".Name :"+name.productName+" Price : "+name.price);
        }
        System.out.println();

        System.out.println("Choose your product");

        int userOpt=sc.nextInt();
        switch(userOpt)
        {
            case 1:
                cart[c++]=products[0];
                break;
            case 2:
                cart[c++]=products[1];
                break;
            case 3:
                cart[c++]=products[2];
                break;
            case 4:
                cart[c++]=products[3];
                break;
            case 5:
                cart[c++]=products[4];
                break;
            default:
                System.out.println("Invalid option");
                view();
        }

        System.out.println("Enter 1 to add more any other key to exit");
        int option=sc.nextInt();
        if(option==1)
            view();
        else
            return;
    }

    double discount(double price)
    {
        double initialPrice=price;
        if(initialPrice>5000&&initialPrice<10000)

            return initialPrice-1000;

        else if(initialPrice>10000)

            return ((initialPrice*5)/100);
        else
            return initialPrice;
    }
}


class Clothes extends Product
{
    static Scanner sc=new Scanner(System.in);
    String productName;
    double price;
    static int c=0;
    static Clothes [] cart=new Clothes[50];
    Clothes [] products=new Clothes [5];
    String []review=new String [5];
    int k=0;

    Clothes(){}
    Clothes(String productName,double price,String review)
    {
        this.productName=productName;
        this.price=price;
        this.review[k++]=review;
    }


    void detail()
    {
        int l=1;
        double totalPrice=0;
        System.out.println("Your Products List----------------------------------------");
        for(Clothes name:cart)
        {
            if(name==null)continue;
            System.out.println((l++)+".Name :"+name.productName+" Price : "+name.price);
            totalPrice+=name.price;
        }
        double discount=totalPrice-discount(totalPrice);
        System.out.println("Total price              = "+totalPrice);
        System.out.println("Discount                 ="+(totalPrice-discount));
        System.out.println("Final price               ="+discount);
    }

    void view()
    {

        products [0]=new Clothes("Pant",1500,"xxx");
        products [1]=new Clothes("Shirt",1000,"xxx");
        products [2]=new Clothes("T-Shirt",100,"xxxx");
        products [3]=new Clothes("Shorts",200,"xxxx");
        products [4]=new Clothes("Shocks",20,"xxx");

        int l=1;
        System.out.println("Clothes  List-----------------------------------");
        for(Clothes name:products)
        {
            System.out.println((l++)+".Name :"+name.productName+" Price : "+name.price);
        }
        System.out.println();

        System.out.println("Choose your product");

        int userOpt=sc.nextInt();
        switch(userOpt)
        {
            case 1:
                cart[c++]=products[0];
                break;
            case 2:
                cart[c++]=products[1];
                break;
            case 3:
                cart[c++]=products[2];
                break;
            case 4:
                cart[c++]=products[3];
                break;
            case 5:
                cart[c++]=products[4];
                break;
            default:
                System.out.println("Invalid option");
                view();
        }

        System.out.println("Enter 1 to add more any other key to exit");
        int option=sc.nextInt();
        if(option==1)
            view();
        else
            return;
    }

    double discount(double price)
    {
        double initialPrice=price;
        if(initialPrice>500&&initialPrice<100)

            return initialPrice-10;

        else if(initialPrice>1000)

            return ((initialPrice*5)/100);
        else
            return initialPrice;
    }
}

class Billing
{
    Scanner sc=new Scanner (System.in);
    void menu()
    {
        System.out.println("Welcome to Shopping");
        System.out.println("Catlog");
        System.out.println("1.Electronics");
        System.out.println("2.Clothes");

        int userOpt=sc.nextInt();
        if(userOpt==1)
        {
            Product electronic_obj= new Electronics();
            Electronics electronic_obj1=new Electronics();
            electronic_obj1.view();
            electronic_obj.detail();
        }
        else if(userOpt==2)
        {
            Product cloth_obj= new Clothes();
            Clothes cloth_obj1= new Clothes();
            cloth_obj1.view();
            cloth_obj.detail();
        }
        else
        {
            System.out.println("Invalid option");
            menu();
        }
    }

    public static void main (String args[])
    {
        Billing billing_obj=new Billing();
        billing_obj.menu();

    }
}

