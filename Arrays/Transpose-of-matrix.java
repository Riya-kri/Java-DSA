/*
Topic: 2D Arrays
Problem: Transpose of a Matrix

Description:
This program takes a 2x3 matrix as input from the user
and prints its transpose by converting rows into columns.

Time Complexity: O(rows × columns)
Space Complexity: O(1)
*/

public class Transpose 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int array[][] = new int[2][3];
		System.out.println("Enter the elements");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
			array[i][j] = sc.nextInt();
			}
		}
		//transpose
		for(int j=0; j<3; j++) {
			for(int i=0; i<2; i++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
