package apnaCollege;
class Testtt
{
	public static boolean search(int array[],int key,int st,int ed)
	{
		if(st>ed) {
			return false;
		}
		int mid = (st+ed)/2;
		if(array[mid] == key) {
			return true;
		}
		else if(array[mid] < key) {
			return search(array,key,mid+1,ed);
		}
		else {
			return search(array,key,st,mid-1);
		}
	}
}
public class binarySearch
{
	public static void main(String[] args)
	{
		int array[] = {1,2,3,4,5,6};
		System.out.println(Testtt.search(array,68,0,array.length-1));
	}
}