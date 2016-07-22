import java.util.Scanner;

class KinderGarden
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int children=s.nextInt();
		int unique_pairs=1;
		for(int i=0;i<2*children;i++)
		{
			int pairs=2*children-i;
			if(children!=pairs)
			{
				System.out.println(unique_pairs++);
			}
			}
			
		}
		
}
