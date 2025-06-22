package Collections.Tasks.ArrayLists;

import java.util.*;

/*
2. Unique City Names Collector

> Create an ArrayList to store city names entered by the user.
> Ensure no duplicate cities are added.
> Finally, display all unique cities in alphabetical order.

 */
public class Unique_City_names {

    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the city name or Enter finish to exit");
        while(true){
            String name =sc.nextLine();
            if(name.equalsIgnoreCase("finish") )break;
            if(!cities.contains(name)) {
                cities.add(name);
            }
        }
        Collections.sort(cities);
        System.out.println("cities ");
        cities.forEach(System.out::println);
    }
}
