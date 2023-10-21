
public class MinAndMax {
	public int max (int a []) {
		int max =0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	 public int min(int[] a ) {
	      int min = a[0];
	     
	      for(int i=0; i<a.length; i++ ) {
	         if(a[i]<min) {
	            min = a[i];
	         }
	      }
	      return min;
	   }

public static void main(String args[]) {
    int Array[]  = {54, 34, 89, 65, 67};
    MinAndMax m = new MinAndMax();
    System.out.println("Maximum value in the array is::"+m.max(Array));
    System.out.println("Minimum value in the array is::"+m.min(Array));
 }
}
