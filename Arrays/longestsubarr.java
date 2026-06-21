package apnaCollege;

import java.util.*;
class Solution1 {
    public static int longestSubarray(int[] nums, int k) {
       int n = nums.length;
       int max = 0;
       for(int i=0; i<n; i++){
           for(int j=i; j<n; j++){
             int sum = 0;
             for(int l=i; l<=j; l++){
                sum = sum + nums[l];
             }
             if(sum == k) {
               int len = j-i+1;
               if(max < len) {
            	   max = len;
               }
           }
       }
    }
       return max;
}
}
public class longestsubarr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution1.longestSubarray(nums,k));
    }
}