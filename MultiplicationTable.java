import java.util.Scanner;
 
class MultiplicationTable
{
   public static void main(String args[])
   {
      int n, c;
      System.out.println("Enter number:");
      Scanner s= new Scanner(System.in);
      n = s.nextInt();
      System.out.println("Multiplication table of "+n+" is :-");
 
      for ( c = 1 ; c <= 10 ; c++ )
         System.out.println(n+"*"+c+" = "+(n*c));
   }
}
