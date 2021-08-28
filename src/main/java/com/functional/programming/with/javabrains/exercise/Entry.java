package com.functional.programming.with.javabrains.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Monica", "Gellare", 25),
                new Person("Ross", "Gellar", 25),
                new Person("Chandler", "Bing", 25),
                new Person("Joseph", "Tribiani", 25),
                new Person("Phoebe", "Buffay", 25),
                new Person("Regina", "Philange", 25)
        );
        //Step 1 : sort the list by lastname
        //Step 2 : Create a method to print all the elements in the list
        //Step 3 : Create a method to return as list of people who's last name is Gellar

        //Step 1 - ANSWER
        Entry entry = new Entry();
        ListManipulator sortListByLastNameLambda = (List<Person> list) -> {
            Collections.sort(list, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            });
            list.forEach(System.out::print);
        };
        System.out.println("Sorted List by Last Name: \n");
        entry.manipulateList(people, sortListByLastNameLambda);


        //Step 2 - ANSWER
        ListManipulator listPrinterLambda = (List<Person> list) -> list.forEach(System.out::print);
        System.out.println("\n \n Print All the elements: \n");
        entry.manipulateList(people, listPrinterLambda);

        //Step 3 - ANSWER
        ListManipulator filterByLastNameLambda = (List<Person> list) -> {
            (list.stream().filter(s -> s.getLastName().equals("Gellar"))).forEach(System.out::print);
        };
        System.out.println("\n \n List of Gellars : \n");
        entry.manipulateList(people, filterByLastNameLambda);
    }

    private void manipulateList(List<Person> people, ListManipulator manipulator) {
        manipulator.perform(people);
    }
}
