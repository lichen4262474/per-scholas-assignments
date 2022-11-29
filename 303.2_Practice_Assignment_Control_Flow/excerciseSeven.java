import java.util.Scanner;

public class excerciseSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Please provide your marriage status(Single, Married Filing Jointly, Married Filing Separately, or Head of Household):");
		String marriageStatus = input.nextLine();
		System.out.println("Your marriage status is " + marriageStatus);
		System.out.println("Please provide your income:");
		double income = input.nextDouble();
		System.out.println("Your income is: " + income);
		double tax = 0;
		if (
				(marriageStatus.compareTo("Single")==0 && income<=8350)||
				(marriageStatus.compareTo("Married Filling Jointly")==0 && income <= 16700)||
				(marriageStatus.compareTo("Married Filing separately")==0 && income <= 8350)||
				(marriageStatus.compareTo("Head of Household") == 0) && income <= 11950
				){
			tax = income * 0.1;
		}//close if 
		else if (
				(marriageStatus.compareTo("Single")==0 && income<=33950)||
				(marriageStatus.compareTo("Married Filling Jointly")==0 && income <= 67900)||
				(marriageStatus.compareTo("Married Filing separately")==0 && income <= 33950)||
				(marriageStatus.compareTo("Head of Household") == 0) && income <= 45500
				){
			tax = income * 0.15;
		}//close if 
		else if (
				(marriageStatus.compareTo("Single")==0 && income<=82250)||
				(marriageStatus.compareTo("Married Filling Jointly")==0 && income <= 137050)||
				(marriageStatus.compareTo("Married Filing separately")==0 && income <= 68525)||
				(marriageStatus.compareTo("Head of Household") == 0) && income <= 117450
				){
			tax = income * 0.25;
		}//close if 
		else if (
				(marriageStatus.compareTo("Single")==0 && income<=171550)||
				(marriageStatus.compareTo("Married Filling Jointly")==0 && income <= 208850)||
				(marriageStatus.compareTo("Married Filing separately")==0 && income <= 104425)||
				(marriageStatus.compareTo("Head of Household") == 0) && income <= 190200
				){
			tax = income * 0.28;
		}
		else if (
				(marriageStatus.compareTo("Single")==0 && income<=372950)||
				(marriageStatus.compareTo("Married Filling Jointly")==0 && income <= 372950)||
				(marriageStatus.compareTo("Married Filing separately")==0 && income <= 186475)||
				(marriageStatus.compareTo("Head of Household") == 0) && income <= 372950
				){
			tax = income * 0.33;
		}
		else if (
				(marriageStatus.compareTo("Single")==0 && income>372950)||
				(marriageStatus.compareTo("Married Filling Jointly")==0 && income > 372950)||
				(marriageStatus.compareTo("Married Filing separately")==0 && income > 186475)||
				(marriageStatus.compareTo("Head of Household") == 0) && income > 372950
				){
			tax = income * 0.35;
		}
		System.out.printf("Your tax this year is  %.2f", tax);
	}// close main

}// close class
