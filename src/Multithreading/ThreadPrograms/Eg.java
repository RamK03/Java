package Multithreading.ThreadPrograms;

public class Eg implements Runnable
{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        Eg eg_obj=new Eg();
        Thread t1= new Thread(eg_obj);
        Thread t2= new Thread(eg_obj);
        t1.start();
        t2.start();
    }
}
