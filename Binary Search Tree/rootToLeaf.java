package apnaCollege;
import apnaCollege.search.Node;
import java.util.*;
public class rootToLeaf 
{
	public static void path(Node root,ArrayList<Integer> path) {
		if(root == null)
			return;
		path.add(root.data);
		
		if(root.left == null && root.right == null) {
			printpath(path);
		}
		
		path(root.left,path);
		path(root.right,path);
		path.remove(path.size()-1);
	}
	
	public static void printpath(ArrayList<Integer> path) {
		for(int i=0; i<path.size(); i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(10);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.left.left.left = new Node(1);
		root.left.left.right = new Node(4);
		root.right.right = new Node(11);
		root.right.right.right = new Node(14);
		path(root,new ArrayList<>());
	}
}
