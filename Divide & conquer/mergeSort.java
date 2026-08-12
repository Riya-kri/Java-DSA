package apnaCollege;
import java.util.*;
class Test1
{
	public static void sort(String array[], int si, int ed)
	{
		if(ed - si == 1) 
			return;
		int mid = (si+ed)/2;
		sort(array,si,mid);
		sort(array,mid,ed);
		merge(array,si,mid,ed);
	}
	public static void merge(String array[],int si,int mid,int ed) 
	{
		String merarr[] = new String[ed-si];
		int i=si;
		int j=mid;
		int k=0;
		while(i<mid && j<ed) {
			if(array[i].compareTo(array[j]) < 0)
			{
				merarr[k] = array[i];
				i++;
			}
			else {
				merarr[k] = array[j];
				j++;
			}
			k++;
		}
		while(i<mid) {
			merarr[k] = array[i];
			k++; i++;
		}
		while(j<ed) {
			merarr[k] = array[j];
			k++; j++;
		}
		for(int l=0; l<merarr.length; l++) {
			array[si+l] = merarr[l];
		}
		
	}
}
public class mergeSort {
	public static void main(String[] args) {
		String array[] = {"cat","earth","rain","apple"};
		Test1.sort(array,0,array.length);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
