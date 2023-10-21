
public class DuplicateNO {

	public static void main(String [] args) {
		int[] a =  {1,1,4,5,6,1,8,45,6,5,6,5,65,65,6,5};
		
	System.out.print("Duplicate elements in given array: " );
		
		 for(int i = 0; i < a.length; i++) {
			  for(int j = i + 1; j < a.length; j++) {  
				 
	                if(a[i] == a[j])  
		 
			 System.out.print(a[j]+" ");  
			 }	 
		
	}

}
}
