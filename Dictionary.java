import java.util.Scanner;
java.util.Dictionary.*;
import java.lang.*;

class Dictionary
{
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String s1=s.nextLine();
				for(int i=0;i<s1.length();i++)
				{
					if(Dictionary.contains(s1))
					{
					if(s1.charAt(i)!=Dictionary.charAt(i))
					{
						String s2=s1.substring(0,s1.length());
					
						System.out.println("mispelt word");
						System.out.println("correct spelling:"+s2.replaceAll(s1.substring(0,s1.length()),Dictionary.charAt(i));
					}
					}
				}
		}
		private static char charAt(int i) {
			// TODO Auto-generated method stub
			return 0;
		}

		private static boolean contains(String s1) {
			// TODO Auto-generated method stub
			return false;
		}
}

		
