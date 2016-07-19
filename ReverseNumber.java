
import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int n,p = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n != 0 )
      {
          p = p * 10;
          p = p + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse of entered number is "+p);
   }
}
