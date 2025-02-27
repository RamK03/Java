package BasicProblems;

import java.util.*;

public class Result {
    static Scanner sc= new Scanner(System.in);
     String  name="";

     long idGeneration()
    {

        long id=(long)(Math.random()*100);
        return id;
    }

     void marks()
    {
        int []subject=new int[5];
        int j=1;
        long id=idGeneration();
        int totalMarks=0;
        System.out.println("Enter Your Name");
        name=sc.next();

        for(int i=0;i<subject.length;i++)
        {
            System.out.println("Enter mark for subject "+j+" ");
            subject[i]=sc.nextInt();
            j++;
        }

        for(int a:subject)
        {
          totalMarks +=a;
        }

        System.out.println("Roll No "+id+" "+"  Name "+name+"\nyour total marks is "+totalMarks+"/500");

    }
    public static void main(String[] args)
    {

        Result std1= new Result();
        std1.marks();
        Result std2= new Result();
        std2.marks();

    }
}

