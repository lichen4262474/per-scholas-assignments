import java.util.Arrays;
import java.util.Scanner;

public class PracticeAssignmentArray {

	public static void main(String[] args) {
		// Write a program that creates an array of integers with a length of 3. Assign
		// the values 1, 2, and 3 to the indexes. Print out each array element.
		System.out.println("Solution for question 1");
		int[] intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		for (int element : intArray) {
			System.out.println(element);
		}
		// Write a program that returns the middle element in an array. Give the
		// following values to the integer array: {13, 5, 7, 68, 2} and produce the
		// following output: 7
		System.out.println("Solution for question 2");
		int[] secondArray = { 13, 5, 7, 68, 2 };
		int middleIndex = secondArray.length / 2;
		System.out.println(secondArray[middleIndex]);
		// Write a program that creates an array of String type and initializes it with
		// the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
		// Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
		// the new array to verify that the original array was copied.
		System.out.println("Solution for question 3");
		String[] myStringArray = { "red", "green", "blue", "yellow" };
		System.out.println(myStringArray.length);
		String[] myCloneString = myStringArray.clone();
		System.out.println(Arrays.toString(myCloneString));
		// Write a program that creates an integer array with 5 elements (i.e.,
		// numbers). The numbers can be any integers. Print out the value at the first
		// index and the last index using length - 1 as the index. Now try printing the
		// value at index = length ( e.g., myArray[myArray.length ] ). Notice the type
		// of exception which is produced. Now try to assign a value to the array index
		// 5. You should get the same type of exception.
		System.out.println("Solution for question 4");
		int[] intArray4 = { 1, 2, 3, 4, 5 };
		System.out.println(intArray4[0]);
		System.out.println(intArray4[intArray4.length - 1]);
		// Write a program where you create an integer array with a length of 5. Loop
		// through the array and assign the value of the loop control variable (e.g., i)
		// to the corresponding index in the array.
		System.out.println("Solution for question 5");
		int[] intArray5 = new int[5];
		for (int i = 0; i < intArray5.length; i++) {
			intArray5[i] = i;
		}
		System.out.println(Arrays.toString(intArray5));
		// Write a program where you create an integer array of 5 numbers. Loop through
		// the array and assign the value of the loop control variable multiplied by 2
		// to the corresponding index in the array.
		System.out.println("Solution for question 6");
		int[] intArray6 = new int[5];
		for (int a = 0; a < intArray6.length; a++) {
			intArray6[a] = a * 2;
		}
		System.out.println(Arrays.toString(intArray6));
		// Write a program where you create an array of 5 elements. Loop through the
		// array and print the value of each element, except for the middle (index 2)
		// element.
		System.out.println("Solution for question 7");
		int[] intArray7 = { 1, 2, 3, 4, 5 };
		for (int b = 0; b < intArray7.length; b++) {
			if (b == 2) {
				continue;
			}
			System.out.println(intArray7[b]);
		}
		// Write a program that creates a String array of 5 elements and swaps the first
		// element with the middle element without creating a new array.
		System.out.println("Solution for question 8");
		int[] intArray8 = { 1, 2, 3, 4, 5 };
		int firstElement = intArray[0];
		int middleElement = intArray[2];
		intArray8[0] = middleElement;
		intArray8[2] = firstElement;
		System.out.println(Arrays.toString(intArray8));
		// Write a program to sort the following int array in ascending order: {4, 2, 9,
		// 13, 1, 0}.
		// Print the array in ascending order, and print the smallest and the largest
		// element of the array.
		// The output will look like the following:
		// Array in ascending order: 0, 1, 2, 4, 9, 13
		// The smallest number is 0
		// The biggest number is 13
		System.out.println("Solution for question 9");
		int[] intArray9 = { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(intArray9);
		String sortedArray = Arrays.toString(intArray9);
		System.out.println("Array in ascending order: " + sortedArray.substring(1, sortedArray.length() - 1));
		System.out.println("The smallest number is: " + intArray9[0]);
		System.out.println("The smallest number is: " + intArray9[5]);
		// Create an array that includes an integer, 3 strings, and 1 double. Print the
		// array.
		System.out.println("Solution for question 10");
		Object[] x = new Object[] { 1, "a", "b", "c", 2.36d };
		System.out.println(Arrays.toString(x));
		// Write some Java code that asks the user how many favorite things they have.
		// Based on their answer, you should create a String array of the correct size.
		// Then ask the user to enter the things and store them in the array you
		// created. Finally, print out the contents of the array.
		System.out.println("Solution for question 11");
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int arraySize = userInput.nextInt();
		String[] favoriteThings = new String[arraySize];
		for (int printTime = 0; printTime < arraySize; printTime++) {
			System.out.println("Enter your thing: ");
			favoriteThings[printTime] = userInput.next();
		} // close for loop
		System.out.println("Your favorite things are: ");
		for (String thing : favoriteThings) {
			System.out.print(thing + " ");
		}

	}// close main

}// close class
