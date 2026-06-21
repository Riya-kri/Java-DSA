package apnacollege;
//Pallindrome or not
import java.util.Scanner;
public class Pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter a string:"); 
		String str = sc.nextLine();
		int i = 0;
		int c=0;
		int j = str.length()-1;
		for(i=0; i<(str.length()-1)/2; i++) {
			if(str.charAt(i) != str.charAt(j)) 
				c++;	
			else
				j--;
		}
		if(c==0)
			System.out.println("Pallimdrome");
		else
			System.out.println("Not Pallindrome");
	}

}
