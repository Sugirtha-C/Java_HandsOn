package natwest.dataStructures;

//import java.math.*;
public class MinMax {
	
	
	
	static int findMinimum(int arr[], int n)
	{
		int result=arr[0];
		for (int i=1; i<n; i++)
		{
			//result=Math.min(result, arr[i]);
			if (arr[i] < result) {
				
				result=arr[i];
				
			}
		}
		return result;
	}
	
	static int findMaximum(int arr[], int n)
	{
		int result=arr[0];
		for (int i=1;i<n;i++)
		{
			//result=Math.max(result, arr[i]);
			if(arr[i] > result)
			{
				result=arr[i];
			}
		}
		
		return result;
	
}
	public static void main(String args[])
	{
		int elements[]= {12,95,18,4,56,104};
		int minValue= findMinimum(elements, elements.length);
		int maxValue=findMaximum(elements,elements.length);
		System.out.println("The minimum element from the given array is:"+ minValue + "\n" );
		System.out.println("The maximum element from the given array is:"+ maxValue + "\n" );
		
	}
	
}
