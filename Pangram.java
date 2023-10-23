public class Pangram {
	static int size = 26;


	static boolean isLetter(char ch) {
		if (!Character.isLetter(ch))
 
			return false;
//returns true if character is a letter   
		return true;
	}

//function to check all the letters (a to z) are presented in the given string or not  
	static boolean containsAllLetters(String str, int len) {
//converts the given string into lowercase  
		str = str.toLowerCase();

		boolean[] present = new boolean[size];
//loop traverse over each character of the string  
		for (int i = 0; i < len; i++) {
//checks if the current character is a letter  
			if (isLetter(str.charAt(i))) {
				int letter = str.charAt(i) - 'a';
//marks the current letter as present  
				present[letter] = true;
			}
		}
//loop iterate over every letter of the given string   
		for (int i = 0; i < size; i++) {
			if (!present[i])
//returns false if the current character is not presented in the string  
				return false;
		}
//returns true if the current character is presented in the string  
		return true;
	}

//driver Code  
	public static void main(String args[]) {
//string to check  
		String str = "The quick brown fox jumps over the lazy dog";
//determines the length of the given string  
		int len = str.length();
//function calling  
		if (containsAllLetters(str, len))
			System.out.println("The given string is a pangram string.");
		else
			System.out.println("The given string is not a pangram string.");
	}
}