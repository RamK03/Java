
package Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class CallableInterface implements Callable<String >
{

    public static void main(String[] args) throws Exception
    {
        CallableInterface obj2=new CallableInterface();
        ExecutorService obj=Executors.newFixedThreadPool(5);
        Future<String> obj1=obj.submit(obj2);

        String result= obj1.get();
        System.out.println(result);
        obj.shutdown();
    }


    public String call() throws Exception {
        return "hi";
    }
}
