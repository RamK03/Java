package Collections;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> h1= new HashSet<>(50,6.5f);
        h1.add("thinker");
        h1.add("charger");
        h1.addAll(Arrays.asList("cable", "note","list"));
        System.out.println(h1);

        for(String s:h1){
            if(s.equals("charger")) System.out.println(s.hashCode());
            if(s.hashCode()==739062846) System.out.println(s);
        }
        System.out.println(h1.size());
        Collections.addAll(h1,"cable", "note","list");
        h1.add("cable");
        System.out.println(h1);


        LinkedHashSet<String> l1= new LinkedHashSet<>(100,0.80f);
        l1.addAll(h1);
        l1.addFirst("hi");
        System.out.println(l1);

        TreeSet<Integer> t1 =  new TreeSet<>();
        t1.add(3);
        t1.add(1);
        System.out.println(t1.descendingSet());

    }
}
