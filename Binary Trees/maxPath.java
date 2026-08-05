package apnaCollege;
import apnaCollege.diameter2OfNodes.Node;

public class maxPath 
{
	static int maxsum = Integer.MIN_VALUE;
	public static int max(Node root)
	{
		maxPath(root);
		return maxsum;
		}
	public static int maxPath(Node root)
	{
		if(root == null)
			return 0;
		
		int left = Math.max(maxPath(root.left), 0);
		int right = Math.max(maxPath(root.right),0);
		
		int throughroot = root.data + left + right;
		
		maxsum = Math.max(maxsum, throughroot);

		return root.data + Math.max(left, right); 
	}
	public static void main(String[] args) {
		Node root = new Node(-10);
		root.left = new Node(9);
		root.right = new Node(20);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		System.out.println(max(root));
	}

}
