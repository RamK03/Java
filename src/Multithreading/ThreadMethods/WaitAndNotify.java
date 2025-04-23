package Multithreading.ThreadMethods;

public class WaitAndNotify extends Thread
{
   static boolean shared=false;
    static final Object lock = new Object();
    public static void main(String[] args)
    {
        Thread wait=new Thread() {
            public void run() {
                synchronized (lock) {

                    while(!shared)
                    {
                        System.out.println("waiting");

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("Resumed");

                }
            }


        };

        Thread notify=new Thread(()->
        {
            synchronized (lock)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shared=true;
                lock.notify();
                System.out.println("notifying");

            }
        });
        wait.start();
        notify.start();
    }

}
