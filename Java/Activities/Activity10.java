package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args){

        Set<Object> hs = new HashSet<>();
        hs.add("Pencil");
        hs.add("Eraser");
        hs.add("Pen");
        hs.add("Ink");
        hs.add("Protractor");
        hs.add("Compass");

        //size
        System.out.println("size of set:" + hs.size());

        //remove Pencil
        System.out.println("remove pencil from set:" + hs.remove("Pencil"));

        //remove element not present
        System.out.println("remove car from set:" + hs.remove("car"));
        //item present in set or not
        System.out.println("set contains ear?:" + hs.contains("ear"));

        //print
        System.out.println("Name of all objects:");
        for(Object s:hs){
            System.out.println(s);
        }


    }

}
