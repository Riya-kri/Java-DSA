package apnaCollege;
class Sampal7
{
	public static void reverse(StringBuilder str,int i, int j)
	{
		if(i>j)
			return;
		if(i<=j) {
			char t = str.charAt(i);
			str.setCharAt(i, str.charAt(j));
		    str.setCharAt(j, t);
		}
		reverse(str,i+1,j-1);
	}
}
public class reverseString {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("abcd");
		Sampal7.reverse(str,0,str.length()-1);
		System.out.println(str);
	}

}
