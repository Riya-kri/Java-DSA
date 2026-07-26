package apnaCollege;
import apnaCollege.diameterOfNodes.Node;
public class isUnique 
{
    public static boolean isUnivalTree(Node root) {
		if(root == null)
			return true;
		
		if(root.left != null && root.left.data != root.data)
			return false;
		if(root.right != null && root.right.data != root.data)
			return false;
		
		return isUnivalTree(root.left) && isUnivalTree(root.right);
	}
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(1);
		root.right = new Node(8);
		root.left.left = new Node(1);
		root.left.right = new Node(1);
		root.right.right = new Node(1);
		if (isUnivalTree(root))
			System.out.print("YES");
		else 
			System.out.print("NO");	
	}
}
