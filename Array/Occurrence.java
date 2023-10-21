import java.util.Scanner;

public class Occurrence {
	
	
	    
	    static int countOccurrences(int arr[], int n, int x)
	    {
	        int res = 0;
	        for (int i=0; i<n; i++)
	            if (x == arr[i])
	              res++;
	        return res;
	    }
	     
	    public static void main(String args[])
	    {
	    	
	        int arr[] = {1, 2,7, 2, 2,8,8, 2, 3, 4,4,4, 7 ,8 ,8 };
	        int n = arr.length;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number");
	   
	        int x = sc.nextInt();
	        System.out.println("Occurence Of X:" + countOccurrences(arr, n, x)+ " "+"Time");
	    }
	}


