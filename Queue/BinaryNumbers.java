package apnaCollege;
import java.util.*;
public class BinaryNumbers {
	static void generatePrintBinary(int n)
	{
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		
		for(int i=0; i<n; i++) {
			String curr = q.remove();
			System.out.println(curr);
			q.add(curr + "0");
			q.add(curr + "1");
		}
	}
	public static void main(String[] args) {
		generatePrintBinary(10);
	}
}
