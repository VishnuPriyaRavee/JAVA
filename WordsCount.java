import java.util.Scanner;

public class WordsCount
{
    public static int countWords(String s)
    {
        int count = 1;
        for (int i=0;i<=s.length()-1;i++)
        {
            if (s.charAt(i) == ' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s1=in.nextLine();
        System.out.print("Your sentence has " + countWords(s1)+" words.");
    }
}
