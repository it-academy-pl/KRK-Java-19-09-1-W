import java.util.Arrays;

public class LoopsApp {
    public static void main(String[] args) {

	for(int i = 0; i < 10; i++) {
	    if(i % 2 == 0) {
	        continue;
	    }
	    System.out.println(i);
	}


/*	String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	for(String day : weekDays) {
	    if("Sat" == day || "Sun" == day){
		System.out.println(day);
		break;
	    }
	}
*/

/*	String[] tablica = new String[10];
	for (int i = 0; i < 10; i++) {
	    tablica[i] = "Java" + i;
	    if (i == 5) {
	        break;
	    }
	}
	System.out.println(Arrays.toString(tablica));
*/

/*	int[] tablica = new int[10];
	int i = 0;
	do {
	    tablica[i] = i + 1;
	    i++;
	} while(i < tablica.length);
	System.out.println(Arrays.toString(tablica));
*/

/*	int counter = 5;
	while (counter == 0) {
    	    System.out.println("test");
	    //counter = counter - 1;
	    counter--;
	}
*/
/*	int index = 0;
	while (index < args.length) {
	    System.out.println(args[index]);
	    index++;
	}
*/
    }
}