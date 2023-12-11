package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args){
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1,"Red");
        colours.put(2,"Yellow");
        colours.put(3,"Green");
        colours.put(4,"Pink");
        colours.put(5,"Black");

        //print
        System.out.println("Map: " + colours);
        //remove
        colours.remove(5,"Black");
        //print after removing Black
        System.out.println("Map after removing Black: " + colours);
        //contains green or not
        System.out.println("Map contains green:" + colours.containsValue("Green"));

        //size
        System.out.println("Map size:" + colours.size());


    }


}
