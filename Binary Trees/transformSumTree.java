package apnaCollege;
import apnaCollege.diameterOfNodes.Node;
public class transformSumTree 
{
	public static int transform(Node root)
	{
		if(root == null)
			return 0;
		int lftchild = transform(root.left);
	    int rgtchild = transform(root.right);
	    
	    int data = root.data;
	    root.data = lftchild + rgtchild;
	    return root.data + data;
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
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		transform(root);
		preOrder(root);
	}
}
