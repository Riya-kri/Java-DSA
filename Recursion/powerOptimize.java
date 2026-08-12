package apnaCollege;
class Test9
{
	public static int pow(int x, int n)
	{
		if(n == 0)
			return 1;
		//int m = pow(x,n/2) * pow(x,n/2);
		int m = pow(x,n/2);
		  int t = m*m;
		if(n%2 != 0) {
			return x * t;
		}
		return t;		
	}
} 
public class powerOptimize 
{  
	public static void main(String[] args) 
	{
		System.out.println(Test9.pow(2, 10));
	}
}
