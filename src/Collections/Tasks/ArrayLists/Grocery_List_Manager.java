package Collections.Tasks.ArrayLists;

import java.util.*;

/*
4. Grocery List Manager

> Create an ArrayList to manage a grocery shopping list.
> Perform the following operations through methods:
> * Add an item
> * Remove an item
> * Update an item
> * Display the full list

 */
public class Grocery_List_Manager {

   static Scanner sc = new Scanner(System.in);
   static private ArrayList<String> list = new ArrayList<>();

    void add_Item(String item_Name){
        list.add(item_Name);
        System.out.println("Item added");
    }

    void remove_Item(String item_Name){
        if(list.contains(item_Name)){
            list.remove(item_Name);
            System.out.println("Item removed");
        }
        else {
            System.out.println("Item not found");
        }
    }

    void update_Item(String oldItem, String newItem){
            int index=list.indexOf(oldItem);
            list.set(index,newItem);
            System.out.println("Item updated succesfully");
    }

    void product_Lister(){
        for(String s:list){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        Grocery_List_Manager obj =new Grocery_List_Manager();
        while(true) {
            System.out.println("Grocery List Operations\n");

            System.out.println("1.Add item");
            System.out.println("2.Remove item");
            System.out.println("3.Update item");
            System.out.println("4. Show List");
            System.out.println("5.Exit\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 :
                    System.out.println("Enter The Product name");
                    sc.nextLine();
                    String add_Product=sc.nextLine();
                    obj.add_Item(add_Product);
                    break;

                case 2:
                    System.out.println("Enter The Product name");
                    sc.nextLine();
                    String remove_Product=sc.nextLine();
                    obj.remove_Item(remove_Product);
                    break;

                case 3:
                    System.out.println("Enter The Product name");
                    sc.nextLine();
                    String old_Product=sc.nextLine();
                    if(list.contains(old_Product)){
                        System.out.println("Enter The New Product name");
                        String new_Product=sc.nextLine();
                        obj.update_Item(old_Product,new_Product);
                    }
                    else {
                        System.out.println("Item not found");
                    }
                    break;
                case 4:
                    System.out.println("List Of Products");
                    obj.product_Lister();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
