package natwest.dataStructures;

public class SwapArrayElements {

public static void main(String args[])
{
	int elements[]= {34,24,44,54};
	
	elements=swappedData(elements);
	
	System.out.println("the swapped array for index 1 and index 3 is:");
	
	for(int i =0; i<elements.length;i++)
	{
		System.out.println(elements[i]+ " ");
	}
	
}
	static int[] swappedData(int arr[])
	{
		int temp=arr[1];
		 arr[1]=arr[3];
		 arr[3]=temp;
		 
		 return arr;
		 
	}

}

