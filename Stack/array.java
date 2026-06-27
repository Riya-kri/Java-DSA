package apnaCollege;

public class array {
	protected int[] data;
	static int size = 10;
	int ptr = -1;
	
	public array(int size) {
		this.data = new int[size];
	}
	
	public void push(int data) {
		ptr++;	
	}
	public static void main(String[] args) {
		
	}

}
