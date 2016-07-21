public class RandomHelper {
public static int randint(int x,int y)
{
	return (int) (Math.random()*((y-x)+1)+x);
}
static int randdouble(int x,int y)
{
	return (int) (Math.random()*(y-x)+1);
}
}
public class Random {
public static void main(String[] args) {
	System.out.println(RandomHelper.randint(1, 10));
	System.out.println(RandomHelper.randdouble(1,10));
}
}
