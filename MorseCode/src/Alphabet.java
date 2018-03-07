 import java.util.HashMap;
import java.util.Map;

public class Alphabet {
	
	HashMap<Character, String> morseCode = new HashMap<Character, String>();
	//HashMap<Character, String> english = new HashMap<Character, String>();
		
	
	public Alphabet() {
		
	}

	public String convertEnglishToMorse(String english) {
		
		String converted = "";
		
		for (int i = 0; i < english.length(); i++) {
			char c = english.charAt(i);
			
			converted += morseCode.get(c);//getting key and adding to string
		}
		
		return converted;
	}
	
	/*public static String convertMorseToEnglish(String morseCode) {
	    String converted = " ";
	    String change = morseCode.trim();
	    String[] words = change.split("  ");
	    for (String word : words) {
	        for(String letter : word.split(" ")) {
	            for(int i = 0 ; i < morseCode.length(); i++){
	                if(letter.equals(morseCode[i]))
	                    build = build + alpha[x];
	            }
	        }
	        build+=" ";
	    }

	    return converted;
	}*/
	
	public String convertMorseToEnglish(String morse) {
		
		String converted = "";
		
		for (int i = 0; i < morseCode.length(); i++) {
			String c = morseCode.charAt(i);
			
			converted += morseCode.get(c);//getting key and adding to string
		}
		
		return converted;
	}

	public void fill() {
		
		morseCode.put(' ', " / ");
		morseCode.put('a', ".- ");
		morseCode.put('b', "-... ");
		morseCode.put('c', "-.- ");
		morseCode.put('d', "-.. ");
		morseCode.put('e', ". ");
		morseCode.put('f', "..-. ");
		morseCode.put('g', "--. ");
		morseCode.put('h', ".... ");
		morseCode.put('i', ".. ");
		morseCode.put('j', ".--- ");
		morseCode.put('k', "-. ");
		morseCode.put('l', ".-.. ");
		morseCode.put('m', "-- ");
		morseCode.put('n', "-. ");
		morseCode.put('o', "--- ");
		morseCode.put('p', ".--. ");
		morseCode.put('q', "--.- ");
		morseCode.put('r', ".-. ");
		morseCode.put('s', "... ");
		morseCode.put('t', "- ");
		morseCode.put('u', "..- ");
		morseCode.put('v', "...- ");
		morseCode.put('w', ".-- ");
		morseCode.put('x', "-..- ");
		morseCode.put('y', "-.-- ");
		morseCode.put('z', "--.. ");
	}

	
	/*public Object getKeyFromValue(Map hm, Object value) {
		for (Object o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}*/
	

}
