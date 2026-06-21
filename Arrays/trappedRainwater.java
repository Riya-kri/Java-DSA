/*
Topic: Arrays
Problem: Trapping Rainwater

Description:
Given an array representing the height of bars, this program calculates the total amount of rainwater that can be trapped after rainfall.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Test
{	
public static int trWater(int array[])
{
	int wtstore;
	int waterlevel;
	int width = 1;
	int n = array.length;
	
	int maxleft[] = new int[n];
	int maxRight[] = new int[n];
	 
     maxleft[0] = array[0];
     for(int i=1; i<n; i++) 
     {
    	 maxleft[i] = Math.max(array[i],maxleft[i-1]);
     }
     maxRight[n-1] = array[n-1];
     for(int i=n-2; i>=0; i--) 
     {
    	 maxRight[i] = Math.max(array[i],maxRight[i+1]);
     }
     int totalwtstore = 0;
     for(int i=0; i<n; i++) 
     {
    	 waterlevel = Math.min(maxleft[i],maxRight[i]);
    	 wtstore = (waterlevel - array[i])*width;
    	 totalwtstore = totalwtstore + wtstore;
     }
     return totalwtstore;
  }	
}
public class trappedWater 
{
	public static void main(String[] args) 
	{
		int array[] = {4,2,0,6,3,2,5};
		System.out.println(Test.trWater(array));
		}
}
