package apnacollege;
class Test3
{
	public static String count(String str) {
		String newstr = "";
		Integer count = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			if(str.charAt(i) != str.charAt(i+1)) {
				newstr = newstr + str.charAt(i) + count;
			//	newstr = newstr + count;
				count=1;
			}
			if(i == str.length()-2) {
				newstr = newstr + str.charAt(i) + count;
			}
		}
		return newstr;
	}
}
public class stringCompression 
{
	public static void main(String[] args) {
		String str = "aaabbcccddeeee";
		System.out.println(Test3.count(str));
	}
}
