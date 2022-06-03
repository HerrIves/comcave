package test.generics;

import oca.aufgabe01a.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>(10);
        System.out.println(test);
        Test<String> test1 = new Test<>("hello");
        System.out.println(test);

        Map<Person, String> hashMap = new TreeMap<Person, String>(Comparator.comparingInt(Person::getCurrentCount));
        hashMap.put(new Person(), "one");
        hashMap.put(new Person(), "two");
        hashMap.put(new Person(), "three");

        System.out.println(hashMap);


    }
}