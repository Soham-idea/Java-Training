import java.util.*;

public class Findmin {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  size Array ");
		int size=sc.nextInt();
		 System.out.println("Enter the Array elements");
		 int a[] = new int [size];
				 for(int i=0; i< size; i++) {
					  a[i]=sc.nextInt();
				 }
				 int min=a[0];
  				 for(int i=0; i<size; i++) {
  					
  						if(a[i]<min) {
  							min=a[i];
  						
  					}
  						
				 }
  				 System.out.println("Minimum Element is : "+min);
                   
	}

}
