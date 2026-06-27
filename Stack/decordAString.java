package apnaCollege;
import java.util.*;
public class decordAString 
{
	public static void decordString(String str)
	{
		Stack <Character> s = new Stack<>();
		Stack <Integer> t = new Stack<>();
		String newstr = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//If ch is a Number
			if(Character.isDigit(ch)) {
				int k = 0;
				while(Character.isDigit(str.charAt(i))) {
				k = k*10+(ch-'0');
				i++;
				}
				t.push(k);
				i--;
			}
			//For the ']'
			else if(ch == ']') {
			String str1 = "";
				while(!s.isEmpty() && s.peek() != '[') {
					str1 = s.pop() + str1;
				}
				if (!s.isEmpty() && s.peek() == '[') //remove '['
	                s.pop();  
				
				int count = t.pop();
				String temp = "";
				for(int j=0; j<count; j++) {
					temp = temp + str1;
				}
				for(int j=0; j<temp.length(); j++) { //Pushing the repeated result back to string
					s.push(temp.charAt(j));
				}
			}
			//For all the character other than ']' and digits 
			else
				s.push(ch);
		}
		while(!s.isEmpty()) {
			newstr = s.pop() + newstr;
		}
		System.out.println(newstr);
	}

	public static void main(String[] args) {
		String str = "3[a2[c]]";
		decordString(str);
	}
}
