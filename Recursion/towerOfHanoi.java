package apnaCollege;
class Sampal6
{//Execution Pattern not done....
	public static void tower(int n, String source, String helper, String destination)
	{
		if(n == 1) {
			System.out.println("Transfer disk"+n+" from "+source+" to "+destination);
			return;
		}
		tower(n-1,source,destination,helper);
		System.out.println("Transfer disk"+n+" from "+source+" to "+destination);
		tower(n-1,helper,source,destination);
	} 
}
public class towerOfHanoi {
	public static void main(String[] args) {
		Sampal6.tower(3,"S","H","D");
	}
}
