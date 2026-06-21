/*
Topic: Arrays
Problem: Print All Subarrays

Description:
Generate and print all possible contiguous subarrays of a given array.

Time Complexity: O(n³)
Space Complexity: O(1)
*/
import java.util.Scanner;
public class subarray {

	public static void main(String[] args) {
        int array[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			//int start = i;
			for(int j=i;j<array.length;j++) {
				//int end = j;
				for(int k=i; k<=j; k++) {
				 	System.out.print(array[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
