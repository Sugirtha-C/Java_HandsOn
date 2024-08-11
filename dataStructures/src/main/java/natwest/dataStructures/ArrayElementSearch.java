package natwest.dataStructures;

import java.util.*;

public class ArrayElementSearch {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int inputElements[]= {23,45,67,12,95,67};
		
		System.out.println("Enter the element to search:");
		int value=sc.nextInt();
		
		int index = -1;
		
		for(int i=0; i < inputElements.length;i++)
		{
			if( value == inputElements[i])
			{
				index=i;
				break;
				
			}
			
		}
		
		if(index != -1) {
			System.out.println("The search element is present at index :" + index +" which is:" + inputElements[index]);
		}
			else {
				System.out.println("The element is not found in the input array");
			}
			
		
		
		
		
	}
}
