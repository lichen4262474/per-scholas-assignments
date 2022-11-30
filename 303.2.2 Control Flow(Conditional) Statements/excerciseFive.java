import java.util.Scanner;

public class excerciseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type in your grade");
		int score = input.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else if (score < 60 && score >= 0) {
			System.out.println("F");
		} else {
			System.out.println("out of range");
		}
	}// close main

}// close class
