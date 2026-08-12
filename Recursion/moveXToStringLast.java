package apnaCollege;
class Sampal9
{
	public static void move(String str,StringBuilder newstr,int i)
	{
		if(i == str.length()) {
			System.out.println(newstr);
			return;
		}
		if(str.charAt(i) != 'x') {
			newstr.append(str.charAt(i));
		}
		move(str,newstr,i+1);
	}
} 
public class moveXToStringLast {
	public static void main(String[] args) {
		String str = "axbcxxd";
		Sampal9.move(str,new StringBuilder(""),0);	
	}
}