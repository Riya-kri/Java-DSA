package apnaCollege;
import java.util.*;
public class ropesOfMinCost 
{
	public static int minCost(int array[], int n)
	{
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		for(int i=0; i<array.length; i++) {
			pq.add(array[i]);
		}
		int s,t,cost,totalcst=0;
		while(pq.size() > 1) 
		{
		s = pq.poll();
		t = pq.poll();
		cost = s+t;
		totalcst = totalcst + cost;
		pq.add(cost);
		}
		return totalcst;
	}
	public static void main(String[] args) {
		int n = 4;
		int array[] = {4,3,2,6};
		System.out.println(minCost(array,n));
	}
}
