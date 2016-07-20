import java.util.Scanner;


public class  Sum{
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int x, i = 1 ;
	        int sum = 0;
	        x = s.nextInt();
	        while(i <= x)
	        {
	            sum = sum +i;
	            i++;
	        }
	        System.out.println("Sum of "+x+" numbers is :"+sum);
	    } 
				}
			
	
