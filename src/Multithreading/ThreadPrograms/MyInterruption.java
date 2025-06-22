package Multithreading.ThreadPrograms;

import java.util.Random;

public class MyInterruption {
    void signal() {
        try {
            System.out.println("red");
            Thread.sleep(2000);
            System.out.println("yellow");
            Thread.sleep(1000);
            System.out.println("green");
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("<<<<emergengy>>>>>");
            System.err.println("red");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        MyInterruption t=new MyInterruption();
        String arr[]= {"go","stop"};
        Random r=new Random();

        Thread th=new Thread() {
            public void run() {
                int i=0;
                while(i<=20)//6<=20,12<=20,24
                {
                    int value=r.nextInt(arr.length);
                    t.signal();
                    i+=6;
                    if(arr[value].equals("stop")) {
                        interrupt();
                    }
                }
            }
        };

        th.start();
    }

}