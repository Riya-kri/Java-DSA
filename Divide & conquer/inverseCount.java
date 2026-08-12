package apnaCollege;

class Test2{
	public static int count(int array[]) 
	{
		int c=0;
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j])
					c++;
			}
		}
		return c;
	}
}
public class inverseCount {
	public static void main(String[] args) {
		int array[] = {1,7, 3, 5};
		System.out.print(Test2.count(array));
	}
}
