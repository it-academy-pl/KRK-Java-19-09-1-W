import java.util.Arrays;

public class CheckConditionsApp {
    public static void main(String[] args) {
	//if(args.length == 0) {
	//    System.out.println("There was no parameters provided");
	//} else {
	//    System.out.println("There was arguments!");
	//    System.out.println("The first parameter was: " + args[0]);
	//}


	//if(args.length == 0) {
	//    System.out.println("There was no parameters provided");
	//} else if (args.length == 1) {
	//    System.out.println("There was one argument: " + args[0]);
	//} else if (args.length == 2) {
	//   System.out.println("There was two arguments: " + args[0] + " " + args[1]);
	//} else {
	//   System.out.println("There was too many arguments");
	//}

/*	if (true) System.out.println("true");
	  else System.out.println("false");
	
	int first = 10;
	int second = 20;
	int third = first > second ? first : second;
	System.out.println("Third is: " + third);

	int fourth = first < second ? second == 10 ? second : third : first == 20 ? first : third;
	System.out.println("Fourth is: " + fourth);

*/

/*	int first = 10;
	int second = 20;
	if (first <= second || second == 50) {
	    System.out.println("Condition is TRUE");
	}
	if (first >= second && second == 50) {
	    System.out.println("Condition is TRUE");
	}

	if (!(first >= second)) {
	    System.out.println("Condition is FALSE");
	}

	if (first != second) {
	    System.out.println("First not equals to second!");
	}

*/

	int value = 7;
	switch (value) {
	    case 5:
		System.out.println("Value is 5");
		break;
	    case 7:
	    case 10:
		System.out.println("Value is 10 or 7");
		break;
	    default:
		System.out.println("Value is not 5 or 10");
	}

	String text = "5";
	switch (text) {
	    case "5":
		System.out.println("Text is 5");
		break;
	    case "7":
	    case "10":
		System.out.println("Text is 10 or 7");
		break;
	    default:
		System.out.println("Text is not 5 or 10");
	}

	switch (args[1]) {
	    case "-version":
		System.out.println("Demo applicatoin version 1");
		break;
	    case "-help":
		System.out.println("Help under construction");
	}
    }
}