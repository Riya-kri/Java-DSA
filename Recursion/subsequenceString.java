package apnaCollege;
class Sampal2
{
	public static void subseq(String str, String str1, int i) {
		if(i == str.length()) {
			System.out.println(str1);
			return;
		}
		char ch = str.charAt(i);
		subseq(str, str1 + ch, i+1);
		subseq(str, str1, i+1);
	}
}
public class subsequenceString {
	public static void main(String[] args) {
		Sampal2.subseq("abc", "", 0);
	}
}
