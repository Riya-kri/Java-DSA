/*
Topic: Arrays
Problem: Print All Pairs in an Array

Time Complexity: O(n²)
Space Complexity: O(1)

Example:
Input: [1, 2, 3]
Output:
(1,2) (1,3)
(2,3)
*/

package apnaCollege;
import java.util.*;
public class PairsArray {

	public static void main(String[] args) {
		int array[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0; i<array.length;i++) {
		//	int start = array[i];
			for(int j=i+1; j<array.length;j++) {
				System.out.print(array[i]+ "," + array[j]+"  ");
			}
			System.out.println();
		}
	}
}
