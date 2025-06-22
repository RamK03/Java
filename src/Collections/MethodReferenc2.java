package Collections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.*;

class Person{

    String name;
    int weight;

    Person(String name, int weight){
        this.weight=weight;
        this.name=name;
    }
    public String toString(){
        return "Name :"+name+" Weight :"+weight;
    }
}

class Provider{
    public static int compareByName(Person a, Person b){
        return a.name.compareTo(b.name);
    }
    public static int compareByWeight(Person a, Person b){
        return a.weight>b.weight?1:-1;
    }
}

public class MethodReferenc2 {

    public static void main(String[] args) {
        ArrayList<Person> al= new ArrayList<>();
        al.add(new Person("Ajay",87));
        al.add(new Person("Raj",77));
        al.add(new Person("Vihan",66));
        al.add(new Person("Roshan",82));

        Collections.sort(al,Provider::compareByWeight);
        System.out.println(al);

        Collections.sort(al,(a,b)->Provider.compareByName(a,b));
        System.out.println(al);

        Collections.sort(al, (Person a, Person b)->Integer.compare(a.weight, b.weight));
        System.out.println(al);

    }
}
