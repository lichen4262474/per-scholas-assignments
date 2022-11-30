import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two positive number: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Your just entered " + n1 + " and " + n2);
		int greatestCommonDivisor = 1;
		int commonDivisor = 1;
		while ((commonDivisor < n1) && (commonDivisor < n2)) {
			if ((n1 % commonDivisor == 0) && (n2 % commonDivisor == 0)) {
				greatestCommonDivisor = commonDivisor;
			} // close if
			commonDivisor++;// close if

		} // close while
		System.out.println("The greatest common divisor is " + commonDivisor);
	}// close main
}// close class
