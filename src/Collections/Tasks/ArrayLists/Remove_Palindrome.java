
package Collections.Tasks.ArrayLists;
import java.util.*;

/*
5. Remove Palindromes

> Create an ArrayList of strings.
> Identify and remove all words which are palindromes (like madam, racecar).
        > Finally, print the remaining words.
 */

import java.util.ArrayList;

public class Remove_Palindrome {

    static boolean isPalindrome(String s1){
        String s=new StringBuilder(s1).reverse().toString();
        return s1.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>(Arrays.asList("asssa","river","madam", "hello", "racecar", "world", "level", "openai", "noon"));
        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            String s=itr.next();
            if(isPalindrome(s)) itr.remove();
        }

        for(String s:list){
            System.out.println(s);
        }

    }
}
