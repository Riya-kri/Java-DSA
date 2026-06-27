package apnaCollege;
import java.util.*;
public class unixStylpath 
{
	public static void isUnix(String str)
	{
		Stack<String> s = new Stack<>();
		
		String str1[] = str.split("/");
		for(int i=0; i<str1.length; i++) {
			if(str1[i].equals("") || str1[i].equals("."))
				continue;
			else if(str1[i].equals("..")) {
				if(!s.isEmpty())
					s.pop();
			}
			else
			   s.push(str1[i]);
			}
		String result = "";
		for(int i=0; i<s.size(); i++) {
			result = result + "/" + s.get(i);
		}
		if(result == "")
			System.out.println("/");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String str = "/a/b/../c";
		isUnix(str);
	}
}
