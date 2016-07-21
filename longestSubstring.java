Time complexity: O(N). Space:O(1).
class Substring
{
public String longestSubstring(String str)throws NullPointerException
{
	if(str==null)
	{
		throw new NullPointerException();
	}
	if(str.length)==0)
	{
		return "";
	}
	
	//Variation of KMP algorithm.Instead of finding longest suffix that matches a prefix. Find the longest suffix that is lexicographically greater then a prefix	
	int start=-1;
	int i=0;
	int j=1;
	while(j<str.length())
	{
		//If lexicographically less, move on to the next character
		int diff=str.charAt(j)-str.charAt(i);
		if(diff>=0)
		{
			j++;
			i++;
			if(diff>;0)//If current char is lexicographically greater then an earlier character.
			{
				//j indicates length of this string's prefix, use it to determine start
				start=j-i+1;
				break;
			}
		}else
		{
			j++;
		}
	}
	return start!=-1? str.substring(start):"";
}
public ststic void main(String args[])
{

Substring s=new Substring();

System.out.println(s.longestSubstring("aaaaaaaaaaajklpoieurhgdngjkxngjkcnhjfkh"));
}
