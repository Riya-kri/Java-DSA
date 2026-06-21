package apnacollege;
import java.util.Scanner;
//If two strings contain the same characters but in a different order,they can be said to be
//Anagram.
public class anagram 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		System.out.println("Enter the word");
		String str1 = sc.nextLine();
		if (str.length() != str1.length()) {
            System.out.println("Not Anagram");
            return;
        }
		int count =0;
		for(int i=0; i<str.length(); i++) 
		{
			for(int j=0; j<str1.length(); j++) 
			{
				if(str.charAt(i) == str1.charAt(j))
					count++;
			}
		}
		if(count == str.length())
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
