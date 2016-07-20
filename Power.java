public class Power {

   public static void main(String[] args) {

Scanner s=new Scanner(System.in);
   double x = s.nextDouble();
   double y = s.nextDouble();

   
   System.out.println("Math.pow(" + x + "," + y + ")=" + Math.pow(x, y));
   System.out.println("Math.pow(" + y + "," + x + ")=" + Math.pow(y, x));
   }
}
