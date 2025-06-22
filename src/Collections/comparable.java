package Collections;


import java.util.ArrayList;
import java.util.Collections;
import static java.lang.Integer.compare;


class comparableInterface implements Comparable<comparableInterface> {


     String name;
     int id;
     double price;
     comparableInterface(String name,int id,double price)
     {
         this.id=id;
         this.name=name;
         this.price=price;
     }
     public String toString(){
         return "Id-"+id+" Name- "+name+"Price-"+price;
     }

     public int compareTo(comparableInterface obj) {
         return compare(this.id,obj.id);
     }

     public static void main(String args[]) {
         ArrayList<comparableInterface> l1=new ArrayList<>();
         l1.add(new comparableInterface("Burger",8822,198));
         l1.add(new comparableInterface("Pizza",8182,1238));
         l1.add(new comparableInterface("Apple",1882,328));
         l1.add(new comparableInterface("WaterMelon",8812,100));


         Collections.sort(l1);
         System.out.println(l1);

     }


 }