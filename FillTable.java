import java.util.Arrays;
public class FillTable {
    public static void main(String[] args) {
	int[] tablica = new int[20];
	int index = 0;

	while(index < tablica.length) {
 	    tablica[index] = index + 1;
	    index++;
	}

	System.out.println(Arrays.toString(tablica));
    }
}