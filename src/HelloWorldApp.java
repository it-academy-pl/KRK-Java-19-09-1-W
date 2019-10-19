import java.util.Scanner;

public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello Java World!!\n");
	      System.out.println(); //empty line
	      System.out.println("IT Academy");
	      System.out.println(2019);
	      System.out.println("First " + "Second");
	      System.out.println(5+4);
	      System.out.println("5"+"4");

        int integerNumber = 10;
	      integerNumber = integerNumber + 10; //20
	      integerNumber += 10; //20	

        int anotherNumber = 15;


        double doubleNumber = integerNumber + anotherNumber;
        System.out.println(integerNumber);
	      integerNumber++;
        System.out.println(integerNumber);
	      System.out.println(integerNumber + anotherNumber);
        System.out.println(doubleNumber);

	      boolean boolValue = true;
        boolean anotherBoolValue = !boolValue;
        System.out.println(anotherBoolValue);
        
        System.out.print("First");
	      System.out.print("Second");
	      System.out.print("Third");
	      System.out.println();
	
	      Scanner scanner = new Scanner(System.in);
	      String name = scanner.nextLine();
	      System.out.println("Hello " + name);
    }
}
