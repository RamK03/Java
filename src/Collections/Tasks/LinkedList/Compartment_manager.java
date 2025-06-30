package Collections.Tasks.LinkedList;

import java.util.*;

/*
1. Train Compartment Manager

> Use a LinkedList to represent train compartments (each element is a compartment name like "Sleeper", "AC", etc.).
> Allow adding/removing compartments at the beginning, middle, and end.
> Display the full train layout after every change.

 */
public class Compartment_manager {
    LinkedList<String> train = new LinkedList<>();
    static Scanner sc= new Scanner (System.in);

    void addFirst(String compartment){
        train.addFirst(compartment);
        displayTrain();
    }

    void addMiddle(String compartment){
        int index;
        if(train.isEmpty()) index=0;
        else index= train.size()/2;
        train.add(index,compartment);
        displayTrain();
    }

    void addLast(String compartment){
        train.addLast(compartment);
        displayTrain();
    }

    void removeFirst(){
        if(!train.isEmpty()){
            train.removeFirst();
             displayTrain();
        }
        else
            System.out.println("Train is empty");
    }

    void removeMiddle(){
        int index;
        if(!train.isEmpty()){
             index= train.size()/2;
             train.remove(index);
            displayTrain();
        }
        else
            System.out.println("Train is empty");
    }

    void removeLast(){
        if(!train.isEmpty()){
             train.removeLast();
             displayTrain();
          }
        else
            System.out.println("Train is empty");
    }

    void displayTrain(){
        System.out.println("\nTrain\n");
        for(String s:train){
            System.out.println(s);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Compartment_manager manager= new Compartment_manager();

        while(true) {
            System.out.println("welcome to the compartment manager system\n");
            System.out.println("1.Add compartment in first");
            System.out.println("2.Add compartment in middle");
            System.out.println("3.Add compartment in last");
            System.out.println("4.Remove compartment in first");
            System.out.println("5.Remove compartment in middle");
            System.out.println("6.Remove compartment in last");
            System.out.println("7.exit\n");
            System.out.print("Enter your choice: ");


            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter comparment name: ");
                    manager.addFirst(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter comparment name: ");
                    manager.addMiddle(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter comparment name: ");
                    manager.addLast(sc.nextLine());
                    break;

                case 4:
                    manager.removeFirst();
                    break;

                case 5:
                    manager.removeMiddle();
                    break;

                case 6:
                    manager.removeLast();
                    break;

                case 7:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}

