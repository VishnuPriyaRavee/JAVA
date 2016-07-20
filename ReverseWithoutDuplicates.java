import java.util.*;
public class ReverseWithoutDuplicates {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	char c;
	String s2="";
	s.close();
	for(int i=0;i<s1.length();i++)
	{
		c=s1.charAt(i);
		if(c!=' ')
		{
			s2=s2+c;
			s1=s1.replace(c, ' ');
		
		}
	}
		System.out.println("String after removing duplicate characters:" +s2);
		StringBuffer sb=new StringBuffer(s2);
		System.out.println(sb.reverse());
	}
}
