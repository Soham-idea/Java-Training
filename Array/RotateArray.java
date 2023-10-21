import java.util.*;

class RR{
	
	int a[];
	int index;
	
	void setData(int a[], int index){
		this.a=a;
		this.index=index;
		}
		
		void getData(){
			for(int i=0 ; i<=index ; i++){
			int	temp = a[0];
				for(int j=0 ; j<a.length-1 ; j++){
					  a[j] = a[j+1];
				}
			       a[a.length-1]=temp;
				    }
					
					for(int i=0 ; i<a.length ; i++){
						          System.out.println(i+" "+a[i]);

					}
		          
		   }
			}
			
			


public class RotateArray{
	public static void main (String x[]){
	   Scanner sc = new Scanner (System.in);
	 
          System.out.println("Enter the Size of Array");
             int size=sc.nextInt();	
  int a[] = new int  [size];			 
		   for(int i=0 ; i<a.length ; i++){
		          a[i]=sc.nextInt();
		   }
		   
		             System.out.println("Enter  Array Index to Rotate");
                      int index = sc.nextInt();
					  
					  RR r = new RR();
					  r.setData(a,index);
					  r.getData();
		
	}
	
	
	
	
}