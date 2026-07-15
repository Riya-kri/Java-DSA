package apnaCollege;
import java.util.*;
import apnaCollege.search.Node;

public class twoSumBSTs 
{
		static class Node {
			int data;
			Node left, right;
			
			public Node(int data) {
				this.data = data;
				left = null;
				right = null;
				}
			}
	
		public static void countPairs(Node root1, Node root2,int x)
		{
			if(root1 == null || root2 == null) 
				return;
			
			java.util.ArrayList<Integer> list1 = new java.util.ArrayList<>();
			java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();
			
            inOrder(root1, list1);
            inOrder(root2, list2);
            
            int i=0, j=list2.size()-1;
            int count=0;
            while(i<list1.size() && j>=0) {
            	int sum = list1.get(i) + list2.get(j);
            	if(sum == x) {
            		System.out.println(list1.get(i)+" "+list2.get(j));
            		count++;
            		i++;
            		j--;
            	}
            	else if(sum < x)
            		i++;
            	else
            		j--;
            }
            System.out.println("Total = "+count);
		}
		public static void inOrder(Node root,ArrayList<Integer> arr)
		{
			if(root == null) {
				return;
			}
			inOrder(root.left,arr);
			arr.add(root.data);
			inOrder(root.right,arr);
		}
	public static void main(String args[])
	{
	    Node root1 = new Node(5);
		root1.left = new Node(3);
		root1.right = new Node(7);
		root1.left.left = new Node(2);
		root1.left.right = new Node(4);
		root1.right.left = new Node(6);
		root1.right.right = new Node(8);
		
		Node root2 = new Node(10);
		root2.left = new Node(6);
		root2.right = new Node(15);
		root2.left.left = new Node(3);
		root2.left.right = new Node(8);
		root2.right.left = new Node(11);
		root2.right.right = new Node(18);
		int x = 16;
		countPairs(root1,root2,x);
	}
}
