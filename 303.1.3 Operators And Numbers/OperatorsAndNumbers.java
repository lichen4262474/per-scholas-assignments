
public class OperatorsAndNumbers {

	public static void main(String[] args) {
	question1();
	question2();
	question3();
	question4();
	question5();
	question6();
	question7();
		}//close main
	
	//Write a program that declares an integer a variable x and assigns the value 2 to it and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
	public void question1() {	
	System.out.println("Problem 1 solution: 1, 1000, 1111, 1001110, 1100010111, 111111010000011");
	}
	public void question2 () {
	System.out.println("Problem 2 solution: 2, 9, 52, 114, 543, 11367");
	}
	public void question3() {
		System.out.println("Problem 3 solution: ");
		int x = 88 << 1;
		//predicted result: 88 is 1011000 in binary  --> 1010000
		System.out.println(Integer.toBinaryString(x));
		// Write a program that declares a variable x and assigns 150 to it, and prints
		// out the binary string version of the number. Now use the right shift operator
		// (>>) to shift by 2 and assign the result to x. Write a comment indicating
		// what you anticipate the decimal and binary values to be. Now print the value
		// of x and the binary string.
		int y = 150 >> 2;
		//predicted result: 150 is 10010110 in binary -->100101
		System.out.println(Integer.toBinaryString(y));
	}
	public void question4() {
		// Write a program that declares three int variables x, y, and z. Assign 7 to x
		// and 17 to y. Write a comment that indicates what you predict will be the
		// result of the bitwise & operation on x and y. Now use the bitwise & operator
		// to derive the decimal and binary values and assign the result to z.
		// Now, with the preceding values, use the bitwise | operator to calculate the
		// “or” value between x and y. As before, write a comment that indicates what
		// you predict the values to be before printing them out.

		System.out.println("Problem 4 solution: ");
		int a = 7; // binary 00111
		int b = 17;// binary 10001
		// & 00001 --1
		// | 10111 --23
		int c = a & b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
	}
	public void question5() {
		// Write a program that declares an integer variable, assigns a number, and uses
		// a postfix increment operator to increase the value. Print the value before
		// and after the increment operator.
		System.out.println("Problem 5 solution: ");
		int myInt = 90;
		myInt++;
		System.out.println(myInt);
	}
	public void question6() {
		// Write a program that demonstrates at least 3 ways to increment a variable by
		// 1 and does this multiple times. Assign a value to an integer variable, print
		// it, increment by 1, print it again, increment by 1, and then print it again.
		System.out.println("Problem 6 solution: ");
		int v = 5;
		v++;
		System.out.println(v);
		v += 1;
		System.out.println(v);
		v = v + 1;
		System.out.println(v);
	}
		// Write a program that declares 2 integer variables, x, and y, and then assigns
		// 5 to x and 8 to y. Create another variable sum and assign the value of ++x
		// added to y, and print the result. Notice the value of the sum (should be 14).
		// Now change the increment operator to postfix (x++) and re-run the program.
		// Notice what the value of the sum is. The first configuration incremented x
		// and then calculated the sum, while the second configuration calculated the
		// sum and then incremented x.
	public void question7(){	
	System.out.println("Problem 7 solution: ");
		int q = 5;
		int w = 8;
		int sum = ++q + w;
		System.out.println(sum);
	}
	
}// close class
