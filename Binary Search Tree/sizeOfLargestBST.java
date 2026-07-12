package apnaCollege;
import apnaCollege.search.Node;
public class sizeOfLargestBST 
{
	static class Info
	{
		boolean isBST;
		int size;
		int min;
		int max;
		
		public Info(boolean isBST,int size,int min, int max) {
			this.isBST = isBST;
			this.size = size;
			this.min = min;
			this.max = max;
		}
	}
	public static int maxsize = 0;
	
	public static Info largestBST(Node root)
	{
		if(root == null) {
			return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		Info leftInfo = largestBST(root.left);
		Info rgtInfo = largestBST(root.right);
		
		int size = leftInfo.size + rgtInfo.size + 1;
		
		int min = Math.min(root.data,Math.min(leftInfo.min, rgtInfo.min));
		int max = Math.max(root.data,Math.max(leftInfo.max, rgtInfo.max));
		
		if(leftInfo.max > root.data || rgtInfo.min < root.data)
			return new Info(false,size,min,max);
		
		if(leftInfo.isBST && rgtInfo.isBST) {
			maxsize = Math.max(maxsize,size);
			return new Info(true,size,min,max);
		}
		return new Info(false,size,min,max);
	}
	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(20);
		
		root.right = new Node(60);
		root.right.left = new Node(45);
		root.right.right = new Node(70);
		root.right.right.left = new Node(65);
		root.right.right.right = new Node(80);
		Info info = largestBST(root);
		System.out.print("Max size = "+ maxsize);
	}
}
