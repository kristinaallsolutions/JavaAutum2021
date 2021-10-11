package sef.module3.sample;

public class MultiDimensionalArraySample {
	public static void main(String[] args) {

		// Multi-dimensional array declaration sample
		// Declaring an integer array with 2 dimensions
		int[][] myIntegerGrid;
		// Declaring a String array with 3 dimensions
		String[][][] myStringCube;

		// Initializing/assigning myIntegerGrid with a size of 5 by 5,
		// which is a total of 25 values/members
		myIntegerGrid = new int[5][5];
		// Initializing/assigning myStringCube with a size of 3 by 3 by 3,
		// which is a total of 27 values/members
		myStringCube = new String[3][3][3];

		// Another way of declaring multi-dimensional arrays
		// Declaring and Constructing an array
		int[][] aNewIntegerGrid = new int[5][5];
		String[][][] aNewStringCube = new String[3][3][3];

		// Yet, another way of declaring arrays
		// Declaring, Constructing and Initializing a multi-dimensional array
		int[][] anotherIntegerArray = { { 1, 2, 3, 4, 5 }, { 6,7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, {16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}};
		String[][][] anotherStringArray = {
				{ { "String 1", "String 2" }, { "String 2", "String 3" } },
				{ { "String 2", "String 3" }, { "String 3", "String 4" } },
				{ { "String 4", "String 5" }, { "String 5", "String 6" } } };

		/*
		 * Multi-dimensional arrays can do all the things a single dimensio nal
		 * array can do it might be a little confusing at first, but you can
		 * still say that its a one dimensional array with arrays as its members
		 */

		System.out.println("Access integer array location 2, 4: " + anotherIntegerArray[2][4]);
		System.out.println("Access integer array location 3, 4: "
				+ anotherIntegerArray[3][4]);

	}
	public void method(String myName) {
		myName = "Not Arturs";
		System.out.println("Hello " + myName);
	}
}
