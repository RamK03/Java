package Collections;

import java.util.*;

public class ArraylistAndLinkedList<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> prices= new ArrayList<>(List.of(33,4,4,4,33));
        System.out.println(prices);
        // set()
        prices.set(4,7798);
        System.out.println(prices);
        //reversed()
        System.out.println( prices.reversed());

        ArrayList<Integer> prices1= new ArrayList<>(Arrays.asList(4,33,4,4,33));
        //retainAll()
        System.out.println(prices.retainAll(prices1));
        System.out.println(prices);

        //remove()
        System.out.println("Removed"+prices.remove(3));
        System.out.println(prices);

        //clear()
        prices.clear();
        System.out.println(prices);

        //clone()
        prices = (ArrayList<Integer>) prices1.clone();
        System.out.println(prices);

        //contains()
        System.out.println(prices.contains(4));

        //forEach()
        prices.forEach((Integer s)-> System.out.println(s) );

        // get ()
        System.out.println( prices.get(3));

        //trimToSize()
        prices.ensureCapacity(10);
        prices.trimToSize();
        System.out.println("Prices capacity "+prices.size());

        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(23);
        l1.addAll(prices);
        l1.removeFirst();
        System.out.println(l1);
        l1.offer(1);
        l1.clear();
       System.out.println(l1.poll());

      System.out.println(l1);
        System.out.println(l1.peek());
        System.out.println(l1);


        Vector<Integer> v1 = new Vector<>();
        v1.setSize(100);
        System.out.println(v1.size());

        Stack<Integer> s1= new Stack<>();
        s1.push(4);
        System.out.println( s1.getFirst());
    }
}
