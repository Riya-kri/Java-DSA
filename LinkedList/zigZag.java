package apnaCollege;

public class zigZag 
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
 
   public void addLast(int data)
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
   
   public static void zigZag()
   {
	   //mid
	   Node slow = head;
	   Node fast = head.next;
	   
	   while(fast != null && fast.next != null)
	   {
		   fast = fast.next.next;
		   slow = slow.next;
	   }
	   Node mid = slow;
	   //Reverse
	   Node curr = mid.next;
	   mid.next = null;
	   Node prev = null;
	   Node next;
	   while(curr != null)
	   {
		   next = curr.next;
		   curr.next = prev;
		   prev = curr;
		   curr = next;
	   }
	   Node left = head;
	   Node right = prev;
	   Node nextLt; 
	   Node nextR;
	   while(left != null && right != null)
	   {
		   nextLt = left.next;
		   left.next = right;
		   nextR = right.next;
		   right.next = nextLt;
		   
		   left = nextLt;
		   right = nextR;
	   }  
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
   	System.out.println();
   }
	public static void main(String[] args) {
		zigZag ll = new zigZag();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.print();
		ll.zigZag();
		ll.print();

	}
}
