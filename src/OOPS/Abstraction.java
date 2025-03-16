package OOPS;

 abstract class AbstractClass
{
    abstract void  override();

}

class Abstraction extends AbstractClass
{
     void  override()
     {
         System.out.println("Abstract Class");
     }
    public static void main(String[] args)
    {
        Abstraction mn= new Abstraction();
        mn.override();
    }
}
