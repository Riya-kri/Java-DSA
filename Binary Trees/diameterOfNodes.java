package apnaCollege;
public class diameterOfNodes 
{
	static class Node
	{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		  }
		}
	public static int height(Node root) {
		if(root == null)
			return 0;
		int lefthgt = height(root.left);
		int righthgt = height(root.right);
		return Math.max(lefthgt,righthgt)+1;	
	}
	
	public static int diameter(Node root)
	{
		if(root == null)
			return 0;
		int leftdia = diameter(root.left);
		int leftht = height(root.left);
		int rghtdia = diameter(root.right);
		int rightht = height(root.right);
		
		int selfdia = leftht + rightht + 1;
		return Math.max(selfdia, Math.max(leftdia, rghtdia));
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(7);
		root.left.left.left.left = new Node(9);
		root.left.right.right = new Node(6);
		root.left.right.right.right = new Node(8);
		//root.right.left = new Node(6);
		//root.right.right = new Node(7);
		System.out.println(diameter(root));
	}
}
