import java.util.Scanner;
public class Natural_noReverseNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Nth number");
		int no=sc.nextInt();
		
		for(int i=no; i>=1 ;i--) {
			
			System.out.println(i);
		}
		
		  System.out.println("using While Loop");
		while(no!=0) {
			
			System.out.println(no);
			no--;
		}
			
			
			
		

	}


	}


