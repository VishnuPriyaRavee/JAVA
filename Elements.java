import java.util.ArrayList;

class Elements
{
	public static void main(String[] args) {
		int c=1;
		int num=Integer.parseInt(args[0]);
		ArrayList<Integer> a = new ArrayList<Integer>(5);

		   a.add(20);
		   a.add(15);
		   a.add(30);
		   a.add(45);
		   a.remove(2);

		for(Integer b:a)
		{
			c*=b;
		}
		System.out.println(c);
	}
}
