public class PositiveOrNegative {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("An integer number as argument is expected");
		} 
		else {
			int a = Integer.parseInt(args[0]);
			if (a < 0) {

				System.out.println(a + " is a negative number");
			} else if (a > 0) {
				System.out.println(a + " is a positive number");
			} else {
				System.out.println(a + " is neither positive nor negative");
			}

		}
	}
}
