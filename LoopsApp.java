
public class LoopsApp {
    public static void main(String[] args) {
/*	int counter = 5;
	while (counter == 0) {
    	    System.out.println("test");
	    //counter = counter - 1;
	    counter--;
	}
*/
	int index = 0;
	while (index < args.length) {
	    System.out.println(args[index]);
	    index++;
	}
    }
}