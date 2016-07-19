import java.util.*;
public class Fibonacci{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a=0,b=1,c=0;
	System.out.println(a);
	System.out.println(b);
	s.close();
	for(int i=2;i<n;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
	
	System.out.println("\n"+"enter number:");
	int p=s.nextInt();

	if(p==c)
	{
		System.out.println("Number is present in fibonacci series");
	}
		else
		{
			System.out.println("Not present");
		}
	}
	
}
