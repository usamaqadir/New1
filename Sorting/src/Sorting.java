

public class Sorting {

	public static void main(String[] args) {
		
	int i;
		
		int[] nums = {3, 1, 5, 2, 9, 8};
		 for (int j = 0; j<nums.length; j++) {
		        for (int k = 0; k < nums.length; k++){
		            if (nums[j] < nums[k]) {
		                int x = nums[j];
		                nums[j] = nums[k];
		                nums[k] = x; 
		            }
		        }
		    }

		 
		 for(i = 0; i < nums.length; i++) 
	            System.out.println( nums[i]+" "); 
	
		 System.out.println(" ");
		 
			int[] nums1 = {1, 3, 5, 2, 9, 8};
			 for (int j = 0; j<nums1.length; j++) {
			        for (int k = 0; k < nums1.length; k++){
			            if (nums1[j] > nums1[k]) {
			                int x = nums1[j];
			                nums1[j] = nums1[k];
			                nums1[k] = x; 
			            }
			        }
			    }
			 
			 
			 for(i = 0; i < nums1.length; i++) 
		            System.out.println( nums1[i]+" ");
			 
	}

}
