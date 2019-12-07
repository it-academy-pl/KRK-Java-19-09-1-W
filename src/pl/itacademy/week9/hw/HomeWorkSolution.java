package pl.itacademy.week9.hw;

import pl.itacademy.week9.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkSolution {
    public static void main(String[] args) {
        Book harryPotter = new Tale();
        Book wiedzmin = new Tale();
        Toy car = new Toy();
        Toy teddyBear = new Toy();

        Box<Book> bookBox = new Box<>();
        bookBox.addItem(wiedzmin);
        bookBox.addItem(harryPotter);

        Box<Toy> toyBox = new Box<>();
        toyBox.addItem(car);
        toyBox.addItem(teddyBear);

        Shelf<Toy> toyShelf = new Shelf<>();
        toyShelf.addBox(toyBox);

        Shelf<Book> bookShelf = new Shelf<>();
        bookShelf.addBox(bookBox);

        GenericShelf genericShelf = new GenericShelf();
        genericShelf.addBox(toyBox);
        genericShelf.addBox(bookBox);
        List<Box<?>> boxes = genericShelf.getBoxes();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number > 3)
                .collect(Collectors.toCollection(LinkedList::new));

        LocalDate today = LocalDate.now();
        Person jan = new Person("Jan", "Kowalski", LocalDate.of(2002, 1, 1));
        //jan.getBirthDay().isAfter(LocalDate.of(2001, 12, 7));
        //boolean isYounger18 = jan.getBirthDay().compareTo(today) < 18;
        //System.out.println(isYounger18);

        Period age = Period.between(LocalDate.now(), jan.getBirthDay());
        System.out.println(Math.abs(age.getYears()));

        LocalDate d = jan.getBirthDay().plus(18, ChronoUnit.YEARS);
        System.out.println(d.isAfter(LocalDate.now()));

        List<Person> persons = new ArrayList<>();
        persons.stream()
                .filter(person ->
                        person.getBirthDay().plus(18, ChronoUnit.YEARS).isAfter(LocalDate.now()))
                .collect(Collectors.toList());

    }
}
