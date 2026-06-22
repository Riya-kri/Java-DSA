package apnaCollege;
class Sample5
{
     public static int search(int array[], int key,int i)
     {
    	 if(i == array.length)
    		 return -1;
    	 if(array[i] == key)
    		 return i;
    	 else
    		return search(array,key,i+1);
     }
}
public class linearSearch {
	public static void main(String[] args) {
         int array[] = {1,2,3,4,4,5};
         System.out.println(Sample5.search(array,4,0));
	}
}
