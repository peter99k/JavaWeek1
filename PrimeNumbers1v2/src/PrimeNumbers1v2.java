
public class PrimeNumbers1v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static String primeNumbers() {
		String numbersList = "";
		for (int i = 3; i <= 3000000; i = i + 2) {
			int counter = 0;
			for (int number = i; number >= 1; number--) {
				if(i%number == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				numbersList = numbersList + i + "";
			}
			return numbersList;
		}
	}
	public static int countNumbers() {
		int numbersCount = primeNumbers().numbersList.length();
	}

}
