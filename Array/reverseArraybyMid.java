import java.util.*;
public class reverseArraybyMid {
      
	public static void main(String x[]) {
		System.out.println("Enter the Array Size");
		Scanner sc = new Scanner(System.in);
		  int size= sc.nextInt();
		    int a[] = new int [size];
		    int mid=size/2;
		    int end=size-1;
		    //for taking inpurt in arry
		    for(int i=0; i<size; i++) {
		    	a[i]=sc.nextInt();
		    			
		    }
		    //for printing array
		    for(int i=0; i<size; i++) {
		    	System.out.println(a[i]);
		    }
		    for(int i=0; i<=mid; i++) {
		    	int temp=a[i];
		    	a[i]=a[end];
		    	a[end]=temp;
		    	end--;
		    }
		    System.out.println("After Reverse");
		    for(int i=0; i<size; i++) {
		    	System.out.println( "a"+"["+i+"]"+a[i]);
		    }
	}
}
