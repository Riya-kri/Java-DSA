package apnaCollege;
class Test2
{
	public static int printFact(int n)
	{
		if(n==0 || n==1) {
			return 1;
		}	
		int fact = n * printFact(n-1);
		return fact;
	}
}
public class factorial 
{
	public static void main(String[] args)
	{
		System.out.println(Test2.printFact(4));
	}
}
