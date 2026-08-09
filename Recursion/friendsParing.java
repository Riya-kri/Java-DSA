package apnaCollege;
class Test13
{
	public static int friends(int n)
	{
		if(n==1 || n==2)
			return n;
		//single
		int fm1 = friends(n-1);
		
		//paired
		int fp = friends(n-2);
		int fpt = (n-1)*fp;
		
		//total
		int totalwys = fm1 + fpt;
		return totalwys;
	}
}
public class friendsParing 
{
	public static void main(String[] args) {
		System.out.println(Test13.friends(4));
	}
}
