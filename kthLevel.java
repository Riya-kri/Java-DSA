package apnaCollege;
import java.util.*;
public class kthLevel 
{//Iterative Way
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static void levelOrder(Node root, int k)
	{
		if(root == null) 
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		int t = 1;
		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr == null) {
				t++;
			if(q.isEmpty()) 
				break;
			q.add(null);
			}
			else{
				if(k == t) 
					System.out.print(curr.data+" ");
				if(k < t)
					break;
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		int k = 3;
		levelOrder(root,k);
	}
}
