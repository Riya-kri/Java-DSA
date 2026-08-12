package apnaCollege;
class Test10
{
	public static int count(int n)
	{
		//base cases
		if(n==0 || n==1)
			return 1;
		//Vertical
		int s = count(n-1);
		
		//Horizontal
		int t = count(n-2);
		int total = s+t;
		return total;
	}
}
public class tilingProblem 
{
	public static void main(String[] args) 
	{
		System.out.println(Test10.count(5));
	}
}
