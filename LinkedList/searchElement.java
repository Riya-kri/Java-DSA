package apnaCollege;
public class searchElement 
{
static class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
	public static Node head;
	public static Node tail;

	public static void addLast(int data)
	{
		if(head == null) {
			Node newNode = new Node(data);
			head = tail = newNode;
			return;
		}
		Node newNode = new Node(data);
		tail.next = newNode;
		tail = newNode;	
	}
	
	public static void search(int key)
	{
		Node temp = head;
		int i=0;
		while(temp != null)
		{		
			if(temp.data == key) {
				System.out.println("Found at " + i);
				return;
			}
			temp = temp.next;
			i++;
		}
	}
	public static void main(String[] args) {
		searchElement ll = new searchElement();
		ll.addLast(2);
		ll.addLast(1);
		ll.addLast(4);
		ll.addLast(3);
		ll.search(4);
	}
}
