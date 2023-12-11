package activities;

import java.util.ArrayList;
import java.util.List;


public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add("Kiwi");
        myList.add("Guava");

        //print
        System.out.println("Name of all objects:");
        for(String s:myList){
            System.out.println(s);
        }

        //get 3rd item
        System.out.println("Third element:" + myList.get(2));
        //array contains orange or not

        System.out.println("list contains orange:" + myList.contains("Orange"));
        //get size
        System.out.println("size of list:" + myList.size());

        //remove Kiwi
        myList.remove("Kiwi");

        //size after removing
        System.out.println("size of list:" + myList.size());


    }

}