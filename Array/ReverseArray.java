public class ReverseArray {

	public static void main (String args[])
	{
	int arr [] = new int[] {1,2,3,4,5};
	System.out.println("main Array");
	
	
	//For printing Main Array
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	System.out.println();
	
	
	System.out.println("Reverse Array is :");
	//For Reversing Array
	for(int i=arr.length-1; i>=0; i--) {
		System.out.print(arr[i] + " ");
		}
	
  }
 } 