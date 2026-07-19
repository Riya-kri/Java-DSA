public class sortedArrayToBST 
{
	public static Node createBST(int array[],int si,int ed)
	{
		if(si > ed)
			return null;
		int mid = (si+ed)/2;
		
		Node root = new Node(array[mid]);
		
		root.left = createBST(array,si,mid-1);
		root.right = createBST(array,mid+1,ed);
		
		return root;
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
	    int array[] = {3,5,6,8,10,11,12};
	    Node root = createBST(array,0,array.length-1);
	    preOrder(root);
	}
}
