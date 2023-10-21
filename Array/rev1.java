import java.util.*;
public class rev1 {
public static void main (String args[])
	{
	Scanner sc =  new Scanner (System.in); 
	System.out.println("Enter the size of Array");
	int size= sc.nextInt();
	int arr [] = new int[size]; 
	System.out.println("Enter main Array");
	
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	

		System.out.println("Reverse Array is :");
	  int mid=arr.length/2;
	  int end = arr.length-1;
	for(int i=0; i<=mid; i++) {
		
		int temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		end--;
	}
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
		
		}
	
  }
  

