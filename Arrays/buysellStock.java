package apnaCollege;
class Testt
{
	public static int Profit(int array[])
	{
		int buy=0;
		int totalpt=0;
		int pt;
		int bp = array[0];
		for(int i=0; i<array.length-1; i++) {
			int sp = array[i+1];
			if(bp < sp) {
				pt = sp - bp;//today's profit
				totalpt = Math.max(totalpt, pt);
			}
			else {
				bp = sp;
			}
		}
		return totalpt;
	} 
}
public class buysellStock {
	public static void main(String[] args) 
	{
		int array[] = {7,1,5,3,6,4};
		System.out.println(Testt.Profit(array));
	}
}
