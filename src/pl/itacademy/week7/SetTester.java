package pl.itacademy.week7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        System.out.println(strings);

        Set<String> linkedStrings = new LinkedHashSet<>();
        linkedStrings.add("first");
        linkedStrings.add("second");
        linkedStrings.add("third");
        linkedStrings.add("fourth");
        linkedStrings.add("first");

        System.out.println(linkedStrings);

        Set<Person> people = new HashSet<>();
        Person nowak = new Person("Jan", "Nowak");
        people.add(nowak);
        System.out.println(people);
        Person jan = new Person("Jan", "Nowak");
        people.add(jan);
        System.out.println(people);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("first");
        treeSet.add("second");
        treeSet.add("third");
        treeSet.add("fourth");
        System.out.println(treeSet);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(13);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Ceiling for 15: " + numbers.ceiling(15));
        System.out.println("Floor for 15: " + numbers.floor(15));
        System.out.println("Head subset for 15:" + numbers.headSet(15));
        System.out.println("Tail subset for 15:" + numbers.tailSet(15));
        System.out.println("Head subset for 20:" + numbers.headSet(20, true));
        System.out.println("Tail subset for 20:" + numbers.tailSet(20));


    }
}
