package Multithreading.ThreadMethods;

public class IsDaemon extends Thread
{
    //isDaemon
    public void run()
    {
        for(int i=0;i<8;i++)
        {
            try
            {
                System.out.println("water");
                //Thread.sleep(20000000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args)
    {
        IsDaemon obj=new IsDaemon();
        obj.setDaemon(true);
       obj.start();
        System.out.println(obj.isAlive());
        System.out.println(obj.isDaemon());

    }
}
