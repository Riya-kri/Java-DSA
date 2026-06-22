package apnaCollege;
class Sampal8
{
	public static void find(String str,int i)
	{
		if(i == str.length()) 
			return;
		
		if(i == 0 || i==str.length()-1) {
			System.out.println(str.charAt(i));
		}
		find(str,i+1);
	}
}
public class FirstandLastOccurence {
	public static void main(String[] args) {
		String str = "Riya";
		Sampal8.find(str,0);
	}
}