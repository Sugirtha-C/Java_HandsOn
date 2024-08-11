package natwest.java_basics;

public class checkChar_UserMainCode {

	//String inputString;
	
	static int checkCharacters(String inputString) {
		
		inputString=inputString.trim();
		
		int lengthOfString = inputString.length();
		
		char firstChar = inputString.charAt(0);;
		char lastChar = inputString.charAt(lengthOfString-1);

		if (Character.toLowerCase(firstChar) == Character.toLowerCase(lastChar))
			return 1;
		
		else
			
			return -1;
	}


}
