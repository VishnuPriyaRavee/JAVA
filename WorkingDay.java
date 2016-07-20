
public class WorkingDay {
	public static void main(String[] args) {
		String[] a=new String[]{"monday","tuesday","wednesday","thursday","friday"};
		String b="sunday";
		String c=args[0];
		boolean bool=true;
		for(int i=0;i<a.length;i++)
		{
		if(a[i].contains(args[0]))
		{
			System.out.println(bool);
			break;
		}
		else
		{
			System.out.println("false");
			break;
		}
	}

}
}
