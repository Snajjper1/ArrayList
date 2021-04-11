package com.perscholas.training;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // list1 can contain only certain type of Objects
        ArrayList<String> list1 = new ArrayList<String>();  //specific data

        // list2 can contain any Objects
        ArrayList list2 = new ArrayList();                  //any data

        // #1 Add data to list
        list1.add("Alice");          //index 0
        list1.add("Andrew");         //index 1
        list1.add("Anna");           //index 2
        list1.add("Arthur");         //index 3
        list1.add("Anthony");        //index 4
        list1.add("Angela");         //index 5
        //list1.add(5);             //wrong type of Object (only String allowed)

        // can use any type of data
        list2.add("John");
        list2.add(110);
        list2.add(3.14);

        // Print whole list in a sequence we added the elements
        System.out.println("list1 is: " + list1);
        System.out.println("list2 is: " + list2);

        // #2 Get the element from list
        String el = list1.get(2);
        System.out.println("Element 2 from list1 is: " + el);


        // Using Object because Object is a parent for any type of data and we don't know specific type here
        Object el1 = list2.get(2);
        System.out.println("Element 2 from list2 is: " + el1);

        // #3 Replace element in the list
        list1.set(2, "James");      //replace element with index 2 to "Fiona"
        System.out.println(list1);

        // #4 Remove element from the list
        list1.remove(2);      //remove element with index 2 from list1
        System.out.println("list1 after deleting is: " + list1);

        // Delete all elements from the list
//        list1.clear();
//        System.out.println("Empty list: " + list1);

        // Does it contain something
        if(list1.contains("Andrew")) System.out.println("Yes");

        // #5 Iterate ArrayList
        System.out.println("____________");
        for (String str : list1){     //enhanced for loop
            System.out.println(str);
        }
        System.out.println("+++++++++++++");

        // Iterating with Iterator
        Iterator<String> iterator = list1.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        // Iterator While loop

        while(iterator.hasNext()){
            String el2 = iterator.next();
            System.out.println(el2);
            if (el2.equals("Alice")) iterator.remove(); //removing Alice from the list
        }

        System.out.println(list1);
    }
}
