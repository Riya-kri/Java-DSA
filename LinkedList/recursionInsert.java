package apnaCollege;
public class recursionInsert 
{
	static class Node{
		int data;
		Node next; 
		
		public Node(int data,Node node) {
			this.data = data;
			this.next = node;
		}
	}
	public static Node tail;
	public static Node head;
	public static void addLast(int data)
	{
		Node newNode = new Node(data,null);
		if(head == null) {
			head =tail  = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;	
	}
	
	public static void insert(int val, int idx)
	{
		head = insertRec(val,idx,head);
	}
	
	private static Node insertRec(int val, int idx, Node node)
	{
		if(idx == 0) {
			Node newNode = new Node(val,node);
			return newNode;
		}
		node.next = insertRec(val,idx-1,node.next);
		return node;
	}
	
	public static void print()
    {
    	if(head == null) {
    		System.out.println("The list is empty");
    	}
    	Node temp = head;
    	while(temp != null) {
    		System.out.print(temp.data+" ");
    		temp = temp.next;
    	}
    }
	public static void main(String[] args) {
		recursionInsert ll = new recursionInsert();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.insert(88,2);
		ll.print();
	}
}
