import java.util.Scanner;


public class  Leapyear{
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n= s.nextInt();;
			if(n%4==0&&n>=1&&n<=12)
			{
				System.out.println("leap year");
			}
			else 
			{
				System.out.println("not a leap year");
			}
		}
			
		}
