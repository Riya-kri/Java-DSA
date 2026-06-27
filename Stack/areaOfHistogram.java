package apnaCollege;
import java.util.*;
public class areaOfHistogram 
{
	public static void maxArea(int arr[])
	{
		Stack<Integer> s = new Stack<>();
		int n = arr.length;
		int nsl[] = new int[n];
		int nsr[] = new int[n];
		
		//next smaller right
		for(int i=n-1; i>=0; i--)
		{
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) 
				nsr[i] = n;
			else 
				nsr[i] = s.peek();
			s.push(i);
		}
		//next smaller left
		s = new Stack<>();
		for(int i=0; i<arr.length; i++)
		{
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) 
				nsl[i] = -1;
			else 
				nsl[i] = s.peek();
			s.push(i);
		}
		//Area of histrogram
		//width j-i-1    nsl[i] - nsr[i] -1
		int max =0;
		for(int i=0; i<arr.length; i++) {
			int height = arr[i];
			int width = nsr[i] - nsl[i] -1;
			int currarea = height*width;
			if(max < currarea) {
				max = currarea;
			}
		}
		System.out.print(max);
		
	}
	public static void main(String[] args) {
		int height[] = {2,1,5,6,2,3};
		maxArea(height);
	}
}
