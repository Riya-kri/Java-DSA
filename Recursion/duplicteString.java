package apnaCollege;
class Test12
{
	public static void duplicate(String str,int idx,StringBuilder newstr, boolean map[])
	{
		if(idx == str.length())
		{
			System.out.println(newstr);
		    return;
		}
		char ch = str.charAt(idx);
		if(map[ch-'a'] == true)//char-a gives the index for any character in the map.
			duplicate(str,idx+1,newstr, map);
		else
		{
			map[ch-'a'] = true;
		    duplicate(str,idx+1,newstr.append(ch), map);
	    }
	}
}
public class duplicteString 
{
	
	public static void main(String[] args) 
	{
		boolean map[] = new boolean[26];
		Test12.duplicate("apnnacollege",0,new StringBuilder(""),map);
	}
}
