package apnaCollege;
class Test4
{
	public static int fibo(int n)
	{
		if(n==0 || n==1)
			return n; 
		int fn = fibo(n-1) + fibo(n-2);
		return fn;
	}
}
public class fibonacciNumber 
{
	public static void main(String[] args)
	{
		System.out.println(Test4.fibo(6));
	}

}
