package natwest.java_basics;

public class MiddleChar_UserMainCode {

	static String getMiddleChars(String inputString) {
		
		int lengthOfInputString=inputString.length();
		if (lengthOfInputString %2 != 0)
			System.out.println("Enter a string with even number of characters only");
		
		int middleIndexValue=lengthOfInputString/2;
		
		char middleIndexChar=inputString.charAt(middleIndexValue);
		char middleIndexChar_2=inputString.charAt(middleIndexValue -1);
		
		//String middleIndexString=Character.toString(middleIndexChar);
		//String middleIndexString_2=Character.toString(middleIndexChar_2);
		
		//String trimmedOutput=middleIndexString_2.concat(middleIndexString);
		
		String trimmedOutput=String.valueOf(middleIndexChar_2)+middleIndexChar;
		
		return trimmedOutput;
		
	}
}
