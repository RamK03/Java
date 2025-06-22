package Collections;

import java.util.*;

public class ComparatorInterface {

    public static void main(String[] args) {

        List<Products> list1 = new ArrayList<>();
        list1.add(new Products('a',128,4,1001));
        list1.add(new Products('d',68,1,1002));
        list1.add(new Products('o',78,2, 5005));
        list1.add(new Products('w',228,9,5429));
        list1.add(new Products('l',100,5,7002));

        Comparator<Products> comp= ( obj1,  obj2) -> {return obj1.name>obj2.name ?1:-1;};

        Collections.sort(list1, comp);
        for(Products ob: list1){
            System.out.println(ob);
        }

    }
}

class Products{
    char name;
    double price;
    int quantity;
    long id;

    Products( char name,double price,int quantity, long id)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.id=id;
    }

    public String toString()
    {
        return "Id :"+id+" Name :"+name+" Price :"+price+" Quantity :"+quantity;
    }
}


