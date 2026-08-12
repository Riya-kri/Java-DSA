package apnaCollege;
import java.util.*;
//Search in Rotated and Sorted Array
//Time Complexity: O(log n)
class Test
{
	public static int search(int[] arr, int target, int si, int ed) {
		if(si > ed) {
			return -1;
		}
		int mid = si+(ed-si)/2;
		
		if(arr[mid] == target) 
			return mid;
		
		if(arr[si] <= arr[mid]) { //If left half is sorted then apply binary search condition in it.
			if(arr[si] <= target && target <= arr[mid])
				return search(arr,target,si,mid-1);
			else
				return search(arr,target,mid+1,ed);
		}
		else //If right half is sorted then apply binary search condition in it.
		{
			if(arr[mid] <= target && target <= arr[ed])
				return search(arr,target,mid+1,ed);
			else
				return search(arr,target,si,mid-1);
		}
	}
}
public class searchRotated {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 5;
		int idx = Test.search(arr,target,0,arr.length-1);
		System.out.println(idx);
	}
}