package apnaCollege;
class Test1
{
	public static void printInc(int n) 
	{
		if(n == 0) 
		{
			return;
		}
		printInc(n-1);
	      	System.out.print(n+" ");
	}
}
public class increasingOrder 
{
	public static void main(String[] args) 
	{
		Test1.printInc(10);
	}
}