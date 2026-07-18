import java.util.*;
public class balancedBST 
{
	public static void getinorder(ArrayList<Integer> inorder,Node root) 
	{
		if(root == null)
			return;
		getinorder(inorder,root.left);
		inorder.add(root.data);
		getinorder(inorder,root.right);	
	}
	
	public static Node createBST(ArrayList<Integer> inorder,int si,int ed)
	{
		if(si > ed)
			return null;
		int mid = (si+ed)/2;
		
		Node root = new Node(inorder.get(mid));
		
		root.left = createBST(inorder,si,mid-1);
		root.right = createBST(inorder,mid+1,ed);
		
		return root;
	}
	
	public static Node balanced(Node root)
	{
		//inorder
		ArrayList<Integer> inorder = new ArrayList<>();
		getinorder(inorder,root);
		
		root = createBST(inorder,0,inorder.size()-1);
		return root;
	}
	public static void preOrder(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.left.left = new Node(3);
		
		root.right = new Node(10);
		root.right.right = new Node(11);
		root.right.right.right = new Node(12);
		root = balanced(root);
		preOrder(root); 
	}
}
