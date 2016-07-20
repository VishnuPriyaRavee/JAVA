import java.util.Scanner;

public class ReversePalindrome
{

      public static void main(String[] args) {
Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            if(n!=0)
            {

                  int sum = 0;

                  while (n!=0) 
                  {
                	  sum += n%10;
                	  n/= 10;
                	  }
                  System.out.println(sum);
                  int b=sum;
                  int reverse=0,remainder;
          		while(sum>0){
          			remainder = sum % 10;
          			reverse = reverse * 10 + remainder;
          			sum=sum/10;
          		}
          		if(reverse==b)
          			System.out.println(b+" is a Palindrome Number");
          		else
          			System.out.println(b+" is not a Palindrome Number");
          	}
          }
}

              
