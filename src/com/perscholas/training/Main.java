package com.perscholas.training;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();

        ArrayList list2 = new ArrayList();

        list1.add("John");
        list1.add("Jennie");
        list1.add("Jim");
        list1.add("Jack");
        list1.add("John");
        list1.add("Joe");

        list2.add("John");
        list2.add(110);
        list2.add(3.14);

        System.out.println("list1 is: " + list1);
        System.out.println("list2 is: " + list2);

        String name = list1.get(2);
        System.out.println(name);

        Object o = list2.get(2);
        System.out.println(o);

        list1.set(2, "Fiona");

        System.out.println(list1);
    }
}
