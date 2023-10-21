import java.util.*;
public class ArraySorting {
	public static void main (String args []) 
	
	{
		
		int a [] = new int[5] ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Given Array");
		 for(int i=0;i<a.length;i++) {
			 
			 a[i] = sc.nextInt();
			   
		 }
//		 for(int i=0;i<a.length;i++) {
//			 System.out.println(a[i]);
//			 
//		 }
		System.out.println("Sorted Array");
		//Sorting Logic
		for(int i=0; i<a.length; i++) {
			for( int j=i+1; j<a.length ; j++)
			{
				if(a[i] > a[j]) 
				{
					int tmp = a[i];  
					a[i] = a[j];  
					a[j] = tmp;  
				}
			}
			System.out.println(a[i]);  
		}
	}

}
