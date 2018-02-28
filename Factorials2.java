
public class Factorials2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revFactorial(3628800);
		revFactorial(479001600);
		revFactorial(6);
		revFactorial(18);
		revFactorial(150);
		revFactorial(120);
	}
	public static void revFactorial(int number) {
		int i = 1;
		double result = number;
		while(result > 1) {
			result = result/(i + 1);
			i++;
		}
		if(result == 1) {
			System.out.println(number + " = " + i + "!"); 
		}
		else {
			System.out.println(number + " NONE ");
		}
	}

}