package apnaCollege;
import java.util.*;
public class firstNonRepeating 
{
	//Find the first non-repeating characters 
	public static void isRepeating(String str)
	{
		Queue <Character> q1 = new LinkedList<>();
		char arr[] = new char[25];
		String newstr = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			q1.add(ch);
			
			arr[ch - 'a']++;
			
			while(!q1.isEmpty() && arr[q1.peek()-'a'] > 1)
			{
				q1.remove();
			}
			if(q1.isEmpty())
				newstr = newstr + "-1";
			else
				newstr = newstr + q1.peek();
		}
		System.out.println(newstr);
	}
	public static void main(String[] args) {
	    String str = "aabccxb";
	    isRepeating(str);
	}
}
