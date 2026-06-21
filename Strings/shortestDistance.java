package apnacollege;
class Test
{
	public static double distance(String path) {
		int x=0,y=0;
		for(int i=0; i<path.length(); i++) {
			char s = path.charAt(i);
			//North
			if(s=='N')
				y++;
			//South
			else if(s=='S')
				y--;
			//East
			else if(s=='E')
				x++;
			//West
			else if(s=='W')
				x--;
		}
		double dist = Math.sqrt((Math.pow(x-0,2)) + (Math.pow(y-0,2)));
		return dist;
	}
}
public class shortestDistance 
{
	public static void main(String[] args) {
		String path = "WNEENESENNN";
		System.out.println(Test.distance(path));
	}

}
