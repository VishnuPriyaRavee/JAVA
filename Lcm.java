import java.util.Scanner;

public class Lcm
{
    public static void main(String args[])
    {
        int a, b, x, y, t, f, lcm;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        x = scan.nextInt();
        y = scan.nextInt();
		
        a = x;
        b = y;
		
        while(b != 0)
        {
            t = b;
            b = a%b;
            a = t;
        }
		
        f= a;
        lcm = (x*y)/f;
		
        System.out.print("\nLCM = " +lcm);
    }
}
