package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         *
         */

        ArrayList<String> arrayList = new ArrayList();
        //adding data into the arraylist
        arrayList.add("Canada");
        arrayList.add("USA");
        arrayList.add("Mexico");
        arrayList.add("Chile");
        arrayList.add("Argentina");
        arrayList.add("Brazil");
        System.out.println("Get the element at index 2:" + " " + arrayList.get(2));
        System.out.println(" Remove the element at index 1: " + " " + arrayList.remove(1));
        System.out.println(" Set a value  at index 0: " + " " + arrayList.set(0, "UK"));
        //using for each loop
        System.out.println(" Use for each loop to print all the elements of an ArrayList");
        for (String s : arrayList) {
            System.out.println(s);
        }

        //using Iterator
        System.out.println("Use White loop With Iterator print all the elements of an ArrayList");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}