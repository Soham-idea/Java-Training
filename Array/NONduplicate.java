
public class NONduplicate {

	
	public static void main(String [] args) {
		
		int[] a = new int[] {4,6,3,7,4,8,7};
		
	System.out.print("Non Duplicate elements in given array: " );
	
		 for(int i = 0; i < a.length; i++) {
			 int count=0;
			 
			 for(int j = 0 ; j < a.length; j++) {  
				 
	                if(a[j] == a[i]) {  
		 
			   count++;
			 }	 
		
	}
		 
       if(count==1) {
    	   System.out.println(a[i]);
       }

}
	}
}
		 
	
