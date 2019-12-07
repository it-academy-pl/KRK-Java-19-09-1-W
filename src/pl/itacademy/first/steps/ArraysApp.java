package pl.itacademy.first.steps;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
	//Add new comment for git demo	

	System.out.println(args[0]);
	System.out.println(args.length);


        int[] ints = new int[3];
	ints[0] = -1;
	ints[1] = -2;
	ints[2] = 5;
	System.out.println(ints[0] + ints[1] + ints[2]);

	int[] numbers = {7, -2, 3, 1};

	System.out.println(Arrays.toString(numbers));


	int[][] twoDimensionInts = new int[2][2];
	twoDimensionInts[0][0] = 5;
	twoDimensionInts[0][1] = 10;
	twoDimensionInts[1][0] = 20;
	twoDimensionInts[1][1] = 30;
	System.out.println(twoDimensionInts[1][1]);
	System.out.println(Arrays.toString(twoDimensionInts));
	System.out.println(Arrays.toString(twoDimensionInts[0]));
	System.out.println(Arrays.toString(twoDimensionInts[1]));
	System.out.println("Text".length());
    }
}