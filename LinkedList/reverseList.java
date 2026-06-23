package apnaCollege;

public class reverseList {
static class Node{
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
	   if(head == null) {
		   Node newNode = new Node(data);
		   head = tail = newNode;
		   return;
	   }
	   Node newNode = new Node(data);
	   tail.next = newNode;
	   tail = newNode;
   }
    public static void reverse()
    {
    	Node prev = null;
    	Node curr = head;
    	Node next;
    	tail = head;
    	
    	while(curr != null) {
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	head = prev; 
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
		reverseList ll = new reverseList();
		reverseList.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.reverse();
		ll.print();               
	}
}
