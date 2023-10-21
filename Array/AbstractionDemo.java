import java.util.Arrays;

abstract class ArrayOperation {
	    public abstract void acceptArray(int a[]);
	}

	class Reversearray extends ArrayOperation {
	    @Override
	    public void acceptArray(int a[]) {
	        int n = a.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = a[i];
	            a[i] = a[n - i - 1];
	            a[n - i - 1] = temp;
	        }
	    }
	}

	class SortArray extends ArrayOperation {
	    @Override
	    public void acceptArray(int a[]) {
	        Arrays.sort(a);
	    }
	}

	public class AbstractionDemo {
	    public static void main(String[] args) {
	        int[] arr = { 5, 3, 8, 1, 9, 2 };
	        
	        // Creating an object of ReverseArray class and calling acceptArray method
	        Reversearray ra = new Reversearray();
	        ra.acceptArray(arr);
	        System.out.println("Reverse Array:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        
	        // Creating an object of SortArray class and calling acceptArray method
	        SortArray sa = new SortArray();
	        sa.acceptArray(arr);
	        System.out.println("\nSorted Array:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }
	}

