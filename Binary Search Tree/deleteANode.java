public class deleteANode 
{
	public static Node delete(Node root,int val)
	{
		if(root == null)
			return null;
		if(root.data < val)
			root.right = delete(root.right,val);
		else if(root.data > val)
			root.left = delete(root.left,val);
		
		else {
			//Case 1: Leaf Node
			if(root.left == null && root.right == null)
				return null;
			
			//Case 2: Single child
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			//Case 3: Both children
			if(root.left != null && root.right != null) {
				Node IS = findInorderSuccessor(root.right);
				root.data = IS.data;
				root.right = delete(root.right, IS.data);
			}
		}
		return root;
	}
	public static Node findInorderSuccessor(Node root)
	{
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	public static void inOrder(Node root)
	{
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(10);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.left.left.left = new Node(1);
		root.left.left.right = new Node(4);
		root.right.right = new Node(11);
		root.right.right.right = new Node(14);
		inOrder(root);
		delete(root,4); 
		System.out.println();
		inOrder(root);
	}
}
