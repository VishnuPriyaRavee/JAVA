
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class ConsecutiveNumDeletion
{
	int[] Consecutive(int num[])
	{
		
		Set<Integer> a= new HashSet<>();
	    int[] b= new int[num.length];
	    int i = 0;

	    for (int element :num)
	        if (a.add(element)) {
	            b[i++]=element;
	        }
	    }
	return Arrays.copyOf(b,i);
	
	int max;
	element[0]=max;
	for(int j=0;j<element.length;j++)
	{
		if(element[j]=max);
		{
			element[j]=max;
			System.out.println(max);
		}
	
	
}
public static void main(String[] args)
{
	int[] num=new int[]{1,2,2,3,4,5,5,6,7,8};
	ConsecutiveNumDeletion p=new ConsecutiveNumDeletion();
	p.Consecutive(num);

}
}
