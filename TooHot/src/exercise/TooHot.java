package exercise;

public class TooHot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tooHot(60, true));
		System.out.println(tooHot(90, true));
		System.out.println(tooHot(99, true));
		System.out.println(tooHot(30, false));
		System.out.println(tooHot(75, false));
		System.out.println(tooHot(91, false));
		System.out.println(tooHot(30, true));
	}
	public static boolean tooHot(int temperature, boolean isSummer) {
		int highTemp = 90;
		int lowTemp = 60;
		int summerHigh = 100;
		boolean result = true;
		if ((temperature >= lowTemp && temperature <= summerHigh) && isSummer) {
			result = true;
		}
		else if (temperature >= lowTemp && temperature <= highTemp && (!isSummer)) {
			result = true;
		}
		else if (temperature >= lowTemp && temperature <= highTemp && isSummer) {
			result = false;
		}
		else if (temperature < lowTemp) {
			result = false;
		}
		else if (temperature > highTemp) {
			result = true;
		}
		else {
			
		}
		return result;
	}

}
