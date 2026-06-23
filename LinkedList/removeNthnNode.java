package apnaCollege;

public class removeNthnNode {
static class Node
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

    public static void addLast(int data)
    {
    	Node newNode = new Node(data);
    	 if(head == null) {
  		   head = tail = newNode;
  	     }
    	 tail.next = newNode;
    	 tail = newNode;
    }
    public static void remove(int n)
    {
    	//calculating size
    	int size = 0;
    	Node temp = head;
    	while(temp != null) {
    		temp = temp.next;
    		size++;
    	}
    	if(n == size)
    	{
    		head = head.next;
    		return;
    	}
    	int i=1;
    	Node prev = head;
    	while(i < size-n)
    	{
    		prev = prev.next;
    		i++;
    	}
    	prev.next = prev.next.next;
    	return;
    }
    public static void print()
    {
    	if(head == null) {
    		System.out.println("The list is empty");
    		return;
    	}
    	Node temp = head;
    	while(temp != null) {
    		System.out.println(temp.data+" ");
    		temp = temp.next;
    	}
    }
	public static void main(String[] args) {
		removeNthnNode ll = new removeNthnNode();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.remove(2);
		ll.print();
	}
}
