
public class ArraySorting1 {
	public static void main (String args []) 
	
	{
		int tmp = 0; 
		int a [] = new int[] {31,21,53,40,5};
		System.out.println("Given Array");
		 for(int i=0;i<a.length;i++) {
			 
			 System.out.println(a[i]);  
		 }
		System.out.println("Sorted Array");
		//Sorting Logic
		for(int i=0; i<a.length; i++) {
			for( int j=i+1; j<a.length ; j++)
			{
				if(a[i] > a[j]) 
				{
					tmp = a[i];  
					a[i] = a[j];  
					a[j] = tmp;  
				}
			}
			System.out.println(a[i]);  
		}
	}

}
