import java.util.regex.Pattern;
 
public class CountSubstring {
	public static int countSubstring(String sub, String s){
		return s.split(Pattern.quote(sub), -1).length - 1;
	}
 public static void main(String[] args){
		System.out.println(countSubstring("th", "the three truths"));
		System.out.println(countSubstring("abab", "ababababab"));
		System.out.println(countSubstring("a*b", "abaabba*bbaba*bbab"));
	}
}
