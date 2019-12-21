package pl.itacademy.builder;

public class CarBuilderTester {
    public static void main(String[] args) {
        Car corsa = new Car.Builder("Opel", "Corsa").build();
        System.out.println(corsa);

        Car clio = new Car.Builder("Renault", "Clio")
                .withColour("Red")
                .withSeatsNumber((short) 4)
                .build();

        Car polo = new Car.Builder("WV", "Polo")
                .withSeatsNumber((short) 5)
                .withWheelsNumber(4)
                .build();

        System.out.println(polo);
        System.out.println(clio);
    }
}
