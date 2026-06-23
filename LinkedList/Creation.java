package apnaCollege;
public class Creation 
{
	//Create a linked list
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static Node head;
	public static Node tail;
	static int size = 1;
	
	//Add data at beginning
	public void addFirst(int data)
	{
		if(head == null) {     //for no node
			Node newNode = new Node(data);
			head = tail = newNode;
			return;
		}
		Node newNode = new Node(data); //step1 = create new node
		size++;
		newNode.next = head;           //step2 = newNode next will point to head
		head = newNode;	
	}
	
	//Add data at end
	public void addLast(int data)
	{
		if(head == null) {
			Node newNode = new Node(data); 
			head = tail = newNode;
			return;
		}
		Node newNode = new Node(data);
		size++;
		tail.next = newNode;
		tail = newNode;
	}
	
	//Add data at mid of the linked list
	public void addmid(int idx, int data)
	{
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i=0;
		while(i < idx-1) {
			i++;
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	//Removing data from beginning
	public void removehead()
	{
		if(size == 0) {
			System.out.println("LL is empty");
			return;
		}
		else if(size == 1) {
			head = tail = null;
			size = 0;
			return;
		}
		head = head.next;
		size--;
		return;
	}
	//Removing data from end
	public void removeLast()
	{
		if(size == 0) {
			System.out.println("LL is empty");
			return;
		}
		if(size == 1) {
			head = tail = null;
			return;
		}
		Node prev = head;
		for(int i=0; i<size-2; i++) {
			prev = prev.next;
		}
		//int val = tail.data; To store the data of tail
		prev.next = null;
		tail = prev;
		size--;
	}
	
	//Priting of Linked list
		public void print()
		{
			if(head == null) {
				System.out.println("Linked list is empty");
				return;
			}
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	public static void main(String[] args) {
		Creation ll = new Creation();
	    ll.addFirst(2);
	    ll.addFirst(1);
	    ll.addLast(3);
	    ll.addLast(4);
	    ll.removeLast();
	    ll.print();
	    System.out.println("The size is " + ll.size);
	}
}
