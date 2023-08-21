import java.util.*;
public class Main {
	public static void main(String[] args) {
		int nums[] = {1, 2, 3};
		boolean ans = containsDuplicate(nums);
		System.out.println(ans);
	}
	static boolean containsDuplicate(int[] nums){
    	   if(nums.length <= 1){
    	        return false;
    	   }
    	   Arrays.sort(nums);
    	  for(int i = 1; i < nums.length; i++){
    	        if(nums[i] == nums[i-1]){
    	            return true;
    	        }
    	  }
         return false;                      
	}
}