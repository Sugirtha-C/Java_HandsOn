package natwest.java_basics;


public class NewWord_UserMainCode {

	static String formNewWord(String inputString, int n ){
		
		//StringBuilder sb=new StringBuilder(inputString);
		
		int lengthOfString=inputString.length();
				
		
		String beginningChar=inputString.substring(0,n);		
		
		String endingChar=inputString.substring(lengthOfString-n);	
		
		String trimmedString=beginningChar.concat(endingChar);
		
		
		return trimmedString;
		
	}
	
}
