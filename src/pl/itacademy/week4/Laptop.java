package pl.itacademy.week4;

public class Laptop {
    public final boolean hasDisplay = true;

    public static int counter;

    public String name;
    public int weight;
    public boolean isSwitchedOn;

    public Laptop() {
        System.out.println("New Laptop has been created!");
        counter++;
    }

    public Laptop(int weight) {
        this();
        this.weight = weight;
    }

    public Laptop(String name) {
        this(2);
        this.name = name;
        isSwitchedOn = false;
    }

    public void setName(String newName) {
        this.name = newName;
        System.out.println("Name has been changed to " + newName);
        newName = null;
        System.out.println("newName value is " + newName);
    }

    public static void main(String[] args) {
        System.out.println("Created laptops so far: " + counter);
        Laptop mac = new Laptop("MacBookPro");
        System.out.println("Created laptops so far: " + counter);
        Laptop dell = new Laptop ("Dell");
        System.out.println("Created laptops so far: " + counter);
        Laptop hp = new Laptop ("HP");
        System.out.println("Created laptops so far: " + counter);

        String acer = "ACER";
        System.out.println(acer);
        hp.setName(acer);
        System.out.println(acer);

        final Double pi = 3.1415;

        Integer i = 5;
        Integer j = new Integer(7);
        String text = "Hello world";
        text = new String("TEST");
    }
}
