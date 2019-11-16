package pl.itacademy.week7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        System.out.println(numbers);

        numbers.add(1, 20);
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);

        for(int i=0; i<numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
        }

        for(Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println(numbers.contains(10));
        System.out.println(numbers.contains(20));

        Person nowak = new Person("Jan", "Nowak");
        Person kowalski = new Person("Janusz", "Kowalski");

        List<Person> people = new ArrayList<>();
        people.add(nowak);
        people.add(kowalski);
        System.out.println(people);

        Person anotherNowak = new Person("Jan", "Nowak");
        System.out.println(people.contains(anotherNowak));

    }
}
