package basic_bonus;

public class Leetcode_medium_33_Search_in_Sorted_Rotated_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {7,6,5,4,0,1,2,}; 
		int target = 6;
		
		System.out.println(search(nums, target));
		

	}
	public static int search(int[] nums, int target) {
	        
	        
	        int low = 0, high =nums.length-1;
	        
	        while(low <= high){
	            
	            int mid = low + (high - low)/2;
	            
	            if(nums[mid] == target){
	                return mid;
	            }
	            if(nums[mid] < nums[high]){ // assuming target on right side
	                
	                if(nums[mid] < target && target<=nums[high]){  
	                    low = mid + 1;
	                    
	                }else
	                    high = mid - 1;
	
	            }else{
	                if(nums[low] <= target && nums[mid] >target ){
	                    high = mid - 1;
	                }else
	                    low = mid + 1;
	            }
	            
	        }
	         
	        return -1;
	    }
}
