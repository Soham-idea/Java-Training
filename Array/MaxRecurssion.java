import java.util.*;
public class MaxRecurssion {
	int i=0;
	int max1=0;
	int max(int a[] ) {
		if(i<a.length) {
			  if(a[i]>max1) {
				  max1=a[i];
			  }
			  i++;
			  return max (a);
		  }
			  return max1;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the Size of Array");
		 int size = sc.nextInt();
		int a[] = new int [size];
         for(int i=0 ; i<a.length; i++) {
			 a[i]=sc.nextInt();
		 }
		  MaxRecurssion mr = new MaxRecurssion();
		 int result=mr.max(a);
		System.out.println(result);	 
	}

}
