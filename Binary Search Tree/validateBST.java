package apnaCollege;
import apnaCollege.search.Node;
public class validateBST 
{
	public static boolean isValid(Node root,Node min,Node max)
	{
		if(root == null)
			return true;
		
		if(min != null && root.data <= min.data)
			return false;
		
		else if(max != null && root.data >= max.data)
			return false;
		
		return isValid(root.left,min,root) && isValid(root.right,root,max);
	}
	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		if(isValid(root, null, null)) {
			System.out.println("Valid Tree");
		}else
			System.out.println("Not a valid tree");
	}
}
