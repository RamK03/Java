package Multithreading;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Executor_Service implements Runnable
{
    public void run()
    {
        System.out.println("Executing"+Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        ExecutorService pool=  Executors.newCachedThreadPool();
        pool.execute(new Executor_Service());
        pool.execute(new Executor_Service());
        pool.execute(new Executor_Service());
        pool.execute(new Executor_Service());
        pool.shutdown();
    }
}
