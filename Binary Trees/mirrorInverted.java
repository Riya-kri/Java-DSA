
public class mirrorInverted
{
	public static void mirror(Node root)
	{
		if(root == null)
			return;
		mirror(root.left);
		mirror(root.right);
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	public static void inOrder(Node root) {
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		inOrder(root);
		mirror(root);
		System.out.println();
		inOrder(root);
	}
}
