package apnaCollege;
class Sample9
{
	public static void sorting(int array[],int si,int ed)
	{
		if(si>=ed)
			return;
		int left = si;
		int right = ed;
		int mid = si+(ed-si)/2;
		int pivot = array[mid];
		
		while(si<=ed) {
			while(array[si] < pivot) {
				si++;
			}
			while(array[ed] > pivot) {
				ed--;
			}
			if(si <= ed) {
				int temp = array[si];
				array[si] = array[ed];
				array[ed] = temp;
				si++;
				ed--;
			}
		}
		//Now pivot is at correct index please sort two halves
		sorting(array,left,ed);
		sorting(array,si,right);	
	}
}
public class quickSort {
	public static void main(String[] args) {
		int array[] = {3,5,2,1,9};
		Sample9.sorting(array,0,array.length-1);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}