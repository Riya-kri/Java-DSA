package apnaCollege;
public class isSubtree 
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
	public static boolean isSubtree(Node root, Node subroot)
	{
		if(root == null)
			return false;
		if(root.data == subroot.data) {
			if(isIdentical(root,subroot)) {
				return true;
			}
		}
		//boolean leftans = isSubtree(root.left,subroot);
		//boolean rgtans  = isSubtree(root.right,subroot);
		return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
	}
	public static boolean isIdentical(Node node, Node subnode)
	{
		if(node == null && subnode == null)
			return true;
		else if(node == null || subnode == null || node.data != subnode.data)
			return false;
		if(!isIdentical(node.left,subnode.left)) 
			return false;
		if(!isIdentical(node.right,subnode.right))
			return false;
		return true;
	}

	public static void main(String[] args) {
		/* 1
		  / \
		 2   3
		/\   /\
	   4  5  6 7
	*/
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		/* 2
		  / \
		  4 5
		 */
		Node subroot = new Node(2);
		subroot.left = new Node(4);
		subroot.right = new Node(5);
		System.out.println(isSubtree(root,subroot));
	}

}
