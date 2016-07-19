public class Factorial
{
	public static void main(String[] args) 
	{
		
int a=Integer.parseInt(args[0]);
int b=1;
if(a==0||a==1)
{
	System.out.println("1");
}
else
{
do
{
b*=a;
--a;
}
while (a>1);

System.out.println (b);
}
		}

}

