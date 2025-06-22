package Collections.Tasks.ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
1. Student Marks Analyzer

> Create an ArrayList to store marks of students in a subject.
> Write a program to calculate:
> * Total number of students
> * Highest and lowest marks
> * Average marks

 */
public class Studendts_Mark_Analyzer {


    public static void main (String args[]){

        ArrayList<Student> student= new ArrayList();

        student.add(new Student("Divakar",78));
        student.add(new Student("Faizal",69));
        student.add(new Student("Sahin",77));
        student.add(new Student("Afiya",59));
        student.add(new Student("Sofia",73));
        student.add(new Student("Dinesh",71));
        student.add(new Student("Raman",72));

        ArrayList<Integer> marks =new ArrayList<>();
        int total_Sum=0;
        for(Student  a: student){
           marks.add(a.m1);
           total_Sum+=a.m1;
        }

        System.out.println("total No. of Students = "+student.size());
        System.out.println("Maximum Marks = "+ Collections.max(marks));
        System.out.println("Minimum Marks = "+ Collections.min(marks));
        System.out.println("Average Marks = "+ total_Sum/marks.size());
    }
}

class Student{

    String name;
    int m1;

    Student(){}
    Student(String name, int m1){
        this.name=name;
        this.m1=m1;
    }
}
