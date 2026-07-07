package lab;

public class startsWith {
	static class Node {
		Node children[] = new Node[26];
		boolean eow = false;
		
		Node(){
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
		}
	}
	public static Node root = new Node();
	
	public static void insert(String words) {
		Node curr = root;
		for(int level=0; level<words.length(); level++) {
			int idx = words.charAt(level) - 'a';
			if(curr.children[idx] == null)
				curr.children[idx] = new Node();
			
			curr = curr.children[idx]; 
		}
		curr.eow = true;
	}
	public static boolean startsWith(String prefix) {
		Node curr = root;
		
		for(int i=0; i<prefix.length(); i++) {
			int idx = prefix.charAt(i) - 'a';
			if(curr.children[idx] == null)
				return false;
			curr = curr.children[idx];
		}
		return true;
	}

	public static void main(String[] args) {
		String words[] = {"apple","app","mango","man","woman"};
		for(int i=0; i<words.length; i++) {
			insert(words[i]);
		}
		String prefix1 = "app";
		String prefix2 = "mrt";
		System.out.println(startsWith(prefix1));
		System.out.println(startsWith(prefix2));
	}

}
