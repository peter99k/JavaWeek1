
public class RunnerClass {

	public static void main(String[] args) {
		
		String input1 = "peter and hashim";
		//String input2 = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.—";
		
		Alphabet abc = new Alphabet();
		
		abc.fill();
		
		System.out.println(abc.convertEnglishToMorse(input1));
		//System.out.println(abc.getKeyFromValue(input2));

	}

}
