package Collections;

import java.util.*;

public class Eg
{
    public static void main(String args [])
    {
        List<Integer> ob= new ArrayList<>(10);
        ob.add(3);
        ob.add(3);
        ob.add(2);
        ob.add(5);
        ob.add(1);

        for(Integer o : ob )
        {
            if (o.equals(3))ob.remove(3);
            System.out.println(o);
        }

        for(int i=0;i<ob.size();i++)
        {
            if (ob.get(1)==3)ob.remove(1);
            System.out.println(ob.get(i));

        }

    }
}
