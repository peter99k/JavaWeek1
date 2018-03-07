
public class Calculator {
	
	/*int a = 5;
	int b = 3;
	int c = 15;*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(add(15,3,5));
		System.out.print(subtract(15,3,5));
		System.out.print(multiply(15,3,5));
		System.out.print(divide(15,3,5));
		System.out.println();
		System.out.print(add(4,2,8));
		System.out.print(subtract(4,2,8));
		System.out.print(multiply(4,2,8));
		System.out.print(divide(4,2,8));
		System.out.println();
		System.out.print(add(6,2,12));
		System.out.print(subtract(6,2,12));
		System.out.print(multiply(6,2,12));
		System.out.print(divide(6,2,12));
		System.out.println();
		System.out.print(add(6,2,3));
		System.out.print(subtract(6,2,3));
		System.out.print(multiply(6,2,3));
		System.out.print(divide(6,2,3));
		
	}
	public static String add(int a, int b, int c) {
				
		if((a!= b + c) && (b!= a + c) && (c != a + c)){
			return "No addition available, ";
		}
		else if(a > b && b>c) {
			return a + " = " + b  + " + " + c + ", ";
		}
		else if(b > c && a >c) {
			return b + " = " + a  + " + " + c + ", ";
		}
		else if(c>a && a>b) {
			return c + " = " + a  + " + " + b + ", ";
		}
		else {
			return " ";
		}
	}
	public static String subtract(int a, int b, int c) {
				
		if((a != b - c) && (b != a - c) && (c != a - c) && (c!= a- b)){
			return "No subtraction available, ";
		}
		else if(a > b && b > c) {
			return b + " = " + a  + " - " + c + ", ";
		}
		else if(b > c && c > a) {
			return c + " = " + b  + " - " + a + ", ";
		}
		else if(c > a && a > b) {
			return a + " = " + c  + " - " + b + ", ";
		}
		else if(b > a && a > c) {
			return a + " = " + b  + " - " + c + ", ";
		}
		else if(c > b && b > a){
			return b + " = " + c  + " - " + a + ", ";
		}
		else if(a > c && c > b){
			return c + " = " + a  + " - " + b + ", ";
		}
		else {
			return " ";
		}
	}
	public static String multiply(int a, int b, int c) {
		
		if((a!= b * c) && (b!= a * c) && (c != a * c)){
			return "No multiplication available, ";
		}
		else if(a > b && a > c) {
			return a + " = " + b  + " * " + c + ", ";
		}
		else if(b > c && b > a) {
			return b + " = " + a  + " * " + c + ", ";
		}
		else if(c > a && c > b) {
			return c + " = " + a  + " * " + b + ", ";
		}
		else {
			return " ";
		}
	}
	public static String divide(int a, int b, int c) {
		
		if((a != b / c) && (b != a / c) && (c != a / c)){
			return "No division available, ";
		}
		else if(a > b && b > c) {
			return b + " = " + a  + " / " + c + ", ";
		}
		else if(b > c && c > a) {
			return c + " = " + b  + " / " + a + ", ";
		}
		else if(c > a && a > b) {
			return a + " = " + c  + " / " + b + ", ";
		}
		else if(b > a && a > c) {
			return a + " = " + b  + " / " + c + ", ";
		}
		else if(c > b && b > a){
			return b + " = " + c  + " / " + a + ", ";
		}
		else if(a > c && c > b) {
			return c + " = " + a  + " / " + b + ", ";
		}
		else {
			return " ";
		}
	}
}
