package apnaCollege;
import apnaCollege.diameterOfNodes.Node;
public class minDisBtwNodes 
{
	public static Node lca(Node root,int n1, int n2)
	{
		if(root == null)
			return null;
		if(root.data == n1 || root.data == n2)
			return root;
		Node leftval = lca(root.left,n1,n2);
		Node rightval = lca(root.right,n1,n2);
		
		if(leftval == null)
			return rightval;
		if(rightval == null)
			return leftval;
		
		return root;
	}
	public static int minDist(Node root,int n)
	{
		if(root == null)
			return -1;
		
		if(root.data == n)
			return 0;
		
		int lftdis = minDist(root.left, n);
		int rgtdis = minDist(root.right,n);
		
		if(lftdis == -1 && rgtdis == -1) 
			return -1;
		else if(lftdis == -1)
			return rgtdis+1;
		else 
			return lftdis+1; 
	}
	public static int min(Node root, int n1, int n2)
	{
		Node lca = lca(root, n1,n2);
		int dist1 = minDist(lca,n1);
		int dist2 = minDist(lca,n2);
		
		return dist1 + dist2;
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		int n1 = 4, n2=7;
		System.out.println(min(root,n1,n2));
	}
}
