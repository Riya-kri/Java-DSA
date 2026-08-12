package apnaCollege;
class Sampal
{
	public static void remove(String str,int i,StringBuilder newstr)
	{
		if(i == str.length()) {
			System.out.println(newstr);
			return;
		}
		char ch = str.charAt(i);
		if(ch != 'a') {
			 remove(str,i+1,newstr.append(ch));
		}
		else 
	    remove(str,i+1,newstr);
	}
}
public class removableOfChar {
	public static void main(String[] args) {
		Sampal.remove("bacca",0,new StringBuilder(""));
	}
}
