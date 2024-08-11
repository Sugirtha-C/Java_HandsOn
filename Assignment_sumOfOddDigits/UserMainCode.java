package natwest.java_basics;


public class UserMainCode {
	
	
	 static int checkSum(int input) {
			
		int sum=0;		 
			
		while(input > 0){
			
			int lastDigit=input % 10;
			
			if((lastDigit%2) !=0)
				sum=sum+lastDigit;
			
			input = input/10;
		}			
	
		//return sum;	
		
		if (sum % 2 != 0)
			return 1;
		else
			return 0;
		
 }
	 
	 
}
		 
		
	 
	 
	 	 


			


