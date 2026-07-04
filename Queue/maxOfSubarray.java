//Maximum of all subarrays of size k We have an array arr[] of size N and an integer K.
//Find the maximum for each and every contiguous subarray of size k. O(n)
public class maxOfSubarray 
{
	public static void printMax(int arr[], int n, int k)
	{
		Deque<Integer> dq = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			while(!dq.isEmpty() && dq.peek() <=  i-k) {
				dq.poll();
			}
			while(!dq.isEmpty() && arr[dq.peek()] < arr[i]) {
				dq.poll();
			}
			dq.add(i);
			
			if(i >= k-1) {
				System.out.println(arr[dq.peek()]);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {12, 1, 78, 90, 57, 89, 56 };
		int k = 3;
		printMax(arr,arr.length,k);
	}
}
