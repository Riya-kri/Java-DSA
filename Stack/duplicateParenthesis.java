package apnaCollege;
import java.util.*;
public class duplicateParenthesis 
{
	public static boolean isDuplicate(String str)
	{
		Stack<Character> s = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ')' || ch == '}' || ch == ']') {
				int count = 0;
				while(s.peek() != '(') {
					count++;
					s.pop();
				}
				if(count<1)
					return true; //Duplicates exits
				else
					s.pop(); //Duplicate does not exits
			}
			else 
				s.push(ch);
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String str = "((a+b))";
		System.out.print(isDuplicate(str));
	}
}
