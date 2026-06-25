package apnaCollege;

public class bubbleSort
{
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
		
		public static void sorting()
		{
			Node prev = null;
			Node temp = head;
			for(Node i=temp; i.next!=null; i=i.next){
				for(Node j=temp; j.next!=null; j=j.next) {
					if(j.data > j.next.data)
					{
						int t = j.data;
						j.data = j.next.data;
						j.next.data = t;
					}
				}
			}
		}
		public void print()
		{
			if(head == null) {
				System.out.println("Linked list is empty");
				return;
			}
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		bubbleSort ll = new bubbleSort();
		ll.addLast(5);
		ll.addLast(4);
		ll.addLast(3);
		ll.addLast(2);
		ll.addLast(1);
		ll.print();
		ll.sorting();
		ll.print();
	}
}
