package Multithreading.ThreadMethods;

public class StartAndRun implements Runnable
{
    public  void run()
    {
        int i=0;
        while(true)
        {
            System.out.println(i++);
            if(i==7)return;
        }
    }
    public static void main(String[] args)
    {
        StartAndRun aobj=new StartAndRun();
        Run bobj=new Run();
        Thread obj=new Thread(aobj);
        Thread obj1=new Thread(bobj);
        obj.run();
        obj1.start();
        System.out.println("runnable");
    }
}

class Run implements Runnable
{
    public  void run()
    {
        int i=0;
        while(true)
        {
            System.out.println("hi");
            i++;
            if(i==7)return;
        }
    }
}
