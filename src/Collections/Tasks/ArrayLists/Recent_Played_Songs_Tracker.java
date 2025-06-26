package Collections.Tasks.ArrayLists;

import java.util.*;

/*
. Recently Played Songs Tracker

> Simulate a music player using ArrayList that keeps track of the last 5 songs played.
> When a new song is played:
> * Add it to the front of the list
> * If list exceeds 5 songs, remove the oldest one (at the end)
>   Display the current playlist.

 */
public class Recent_Played_Songs_Tracker {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> recently_Played =new ArrayList<>(6);
        while(true){
            System.out.println(" Enter the new song to play");
            String option=sc.nextLine();
            String  song= option.toLowerCase();
            if(song.equals("exit")){
                break;
            }
            if(recently_Played.contains(song)){
                recently_Played.remove(song);
            }
            recently_Played.add(0,song);
            if(recently_Played.size()>5){
                recently_Played.remove(recently_Played.size()-1);
            }
        }

        System.out.println("Your recent playlist");
        for(String s: recently_Played){
            System.out.println(s);
        }
    }
}
