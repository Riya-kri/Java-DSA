package apnaCollege;
class Sample3
{
	public static int sum(int n)
	{
		if(n==0)
			return 0;
		if(n%10 == 0) {
			return 1 + sum(n/10);
		}
		else {
		    return sum(n/10);
		}
	}
}
public class countzeros {
	public static void main(String[] args) {
		System.out.println(Sample3.sum(1020));
	}
}
