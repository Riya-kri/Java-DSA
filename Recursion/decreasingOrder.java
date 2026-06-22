package apnaCollege;
class Test
{
	public static void printDec(int n) 
	{
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDec(n-1);	
	}
}
public class decreasingOrder 
{
	public static void main(String[] args) 
	{
		Test.printDec(10);
	}
}