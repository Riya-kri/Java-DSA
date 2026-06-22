package apnaCollege;
class Sample
{
	public static void sum(int n, int s)
	{
		if(n==0) {
			System.out.print(s);
			return;
		}
		int t = n%10;
		sum(n/10,s+t);
	}
}
public class sumDigit {
	public static void main(String[] args) {
		Sample.sum(1213,0);
	}
}
