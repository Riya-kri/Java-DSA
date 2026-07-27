package apnaCollege;
import java.util.*;
import apnaCollege.kthLevel.Node;

public class kthAncestor 
{
	public static int ancestor(Node root,int n,int k)
	{
		if(root == null)
			return -1;
		if(root.data == n)
			return 0;
		
		int lft = ancestor(root.left,n,k);
		int rgt = ancestor(root.right,n,k);
		
		if(lft == -1 && rgt == -1)
			return -1;
		
		int max = Math.max(lft, rgt);
		if(max+1 == k)
			System.out.print(root.data);
		
		return max+1;
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		int n = 5 ,k = 2;	
		ancestor(root,n,k);
	}
}
