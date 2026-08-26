class Sampal10
{
   public static void keypadcombination(String str,int i, String newstr) {
	   String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	   if(i == str.length()) {
		   System.out.println(newstr);
		   return;
	   }
	   char ch = str.charAt(i);
	   String map = keypad[ch - '0'];
	   for(int j=0; j<map.length(); j++) {
		   keypadcombination(str,i+1,newstr+map.charAt(j));
	   }
	}
}
public class keypadComb {
	public static void main(String[] args) {
		String str = "23";
		Sampal10.keypadcombination(str,0, "");
	}
}
