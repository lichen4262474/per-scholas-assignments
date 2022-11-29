
public class PredictFutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000d;
		int year = 0;
		while (tuition < 20000) {
			tuition = 1.07 * tuition;
			year++;
		} // close while
		System.out.printf("In %d years, the tuition will be doubled.", year);
	}// close main
}// close class
