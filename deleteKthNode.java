package apnaCollege;
import apnaCollege.diameterOfNodes.Node;
public class deleteKthNode 
{
	public static Node delete(Node root, int target) 
	{
		if(root == null)
			return null;
		root.left = delete(root.left,target);
		root.right = delete(root.right,target);
		
		if(root.left == null && root.right == null && root.data == target)
			return null;
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
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(3);
		root.left.left = new Node(3);
		root.left.right = new Node(2);
		inOrder(root);
		delete(root,3);
		System.out.println();
		inOrder(root);
	}
}
