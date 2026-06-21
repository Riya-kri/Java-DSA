package apnacollege;
import java.util.*;
public class countVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		int count =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			count++;
		}
		System.out.println("The number of times vowel occurs is "+ count);
	}

}
