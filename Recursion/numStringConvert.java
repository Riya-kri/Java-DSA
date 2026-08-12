package apnaCollege;
class Sampal4
{
	public static int m;
	public static void convert(String array[],int num,int m)
	{
		if(num == 0) 
			return;
		int r = num % 10;
        m = m*10+r;
        num = num/10;
        
        convert(array,num,0);
      
	   System.out.print(array[m]+" ");
	}
}
public class numStringConvert 
{
	public static void main(String[] args)
	{
		String array[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		Sampal4.m = 0;
		Sampal4.convert(array,15346,0);
	}
}
