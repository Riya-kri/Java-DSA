package apnaCollege;
import java.util.*; //Not correct
public class tappedwater {
	public static int maxWater(int[] height)
	{
		Stack<Integer> s = new Stack<>();
		Stack<Integer> t = new Stack<>();
		
		int n = height.length;
		int width = 1;
		int rgtmax = height[n-1];
		
		s.push(rgtmax);
		for(int i=n-2; i>=0; i--) {
			rgtmax = Math.max(rgtmax, height[i]);
			s.push(rgtmax);
		}
		while(!s.isEmpty()) {
			t.push(s.pop());
		}
		
		int totalwt=0;
		int leftmax = height[0];
		for(int i=0; i<n; i++){
			leftmax = Math.max(leftmax, height[i]);
			int rightmax = t.pop();
			
			int min = Math.min(leftmax,rightmax);
			int wt = (min - height[i])*width;
			
			totalwt = totalwt + wt;
		}
		return totalwt;
	}
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.print(maxWater(arr));
	}
}
