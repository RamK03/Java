package Collections.Tasks.LinkedList;
import java.util.*;

/*
2. Browser History Navigation

> Simulate a browser using a LinkedList.
> Add URLs as the user visits them.
> Allow the user to:
> * Go back to the previous page
> * Go forward (if they had previously gone back)
> * View the current page
 */

public class Browser_History_Manager {
    private static LinkedList<String> history= new LinkedList<>();
    private static ListIterator<String> itr= history.listIterator();
    private static String currentPage=null;

    void visit(String url) {
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        itr.add(url);
        currentPage = url; // just use the added URL directly
        System.out.println("Visited: " + currentPage);
    }

    void previousUrl(){
           if(itr.hasPrevious()){
               currentPage= itr.previous();
               System.out.println("Back To : "+currentPage);
           }
           else System.out.println("No previous page");


    }

    void nextUrl(){
            if(itr.hasNext()){
                currentPage=itr.next();
                System.out.println("Forward To : "+currentPage);

            }
            else {
                System.out.println("no forward page");

            }

    }

    void current() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No page visited yet.");
        }
    }

    public static void main(String[] args) {
        Browser_History_Manager manage = new Browser_History_Manager();

        manage.visit("https://docs.google.com/forms/d/e/1FAIpQLScGQqb_rnvdwwgh_a_dwOL97nh_MAVcrhWEeAZc4q922U6_TQ/viewform?pli=1");
        manage.visit("https://auth.openai.com/log-in");
        manage.nextUrl();
        manage.nextUrl();
        manage.previousUrl();
        manage.visit("file:///C:/Users/USER/AppData/Local/Microsoft/Windows/INetCache/IE/5O8OP6TQ/FEES_2025[1].pdf");
        manage.visit("https://meet.google.com/rst-fykf-auu");
        manage.nextUrl();
        manage.nextUrl();
        manage.previousUrl();
        manage.nextUrl();
        manage.visit("https://tnou.ac.in/");
        manage.nextUrl();
        manage.nextUrl();




    }


}
