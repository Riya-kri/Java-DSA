public class closestElement 
{
	static int closest = Integer.MAX_VALUE;
	public static int difference(Node root, int k)
	{
		if(root == null)
			return closest;
		
		if ( Math.abs(root.data - k) < Math.abs(closest - k)) {
		     closest = root.data;
	    }
		difference(root.left, k);
		difference(root.right, k);

		return closest;
	}
	public static void main(String[] args) {
        // Construct the given BST
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);
        int close = difference(root,10);
        System.out.print(close);
	}
}
