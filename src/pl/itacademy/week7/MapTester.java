package pl.itacademy.week7;

import java.util.Map;
import java.util.TreeMap;

public class MapTester {
    public static void main(String[] args) {
 //       Map<Person, String> beerLovers = new LinkedHashMap<>();
        Map<Person, String> beerLovers = new TreeMap<>();
        Person kowalski = new Person ("Jan", "Kowalski");
        Person nowak = new Person ("Piotr", "Nowak");
        Person sereda = new Person ("Oleg", "Sereda");

        beerLovers.put(kowalski, "Jasne");
        beerLovers.put(nowak, "ciemne");
        beerLovers.put(sereda, "bezalkoholowe");

        System.out.println(kowalski + " lubie " + beerLovers.get(kowalski) + " piwo");
        System.out.println(nowak + " lubie " + beerLovers.get(nowak) + " piwo");
        System.out.println(sereda + " lubie " + beerLovers.get(sereda) + " piwo");

        beerLovers.put(kowalski, "bezalkoholowe");
        System.out.println(kowalski + " lubie " + beerLovers.get(kowalski) + " piwo");

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(beerLovers);
    }
}
