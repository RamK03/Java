package OOPS;

class Animal
{
    String color;
    Animal(String color)
    {
        this.color=color;
    }
    void walk()
    {
        System.out.println("Animal walking");
    }
}

class Tiger extends Animal
{
    Tiger(String color)
    {
        super(color);
        System.out.println("Tiger color is "+super.color);
    }
    void walk()
    {
        System.out.println("Tiger is walking");
    }
}

public class Inheritence
{
    public static void main(String[] args)
    {
        Animal mn= new Tiger("Yellow");
        mn.walk();
    }
}
