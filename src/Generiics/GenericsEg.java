package Generiics;

import java.util.ArrayList;

public class GenericsEg
{
    public static void main(String[] args)
    {
        ArrayList<String> obj= new ArrayList<>();
        obj.add("thu");
        obj.add("thu");
        String on=obj.get(0);
      //  System.out.println(obj.getLast());

        Demo<Integer> obj1=new Demo<>(7);
    }
}

class Demo<T>
{
    T id;
    Demo(T id){
        this.id=id;
        System.out.println(id);
    }
}