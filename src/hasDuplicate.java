import java.util.HashSet;

public class hasDuplicate {
	
	
	    public static boolean hasDuplicates(int[] nums) {
	    	
	    	
	    	HashSet<Integer> seen = new HashSet<>();
	    	
	    	for(int i : nums) {
	    		if(seen.contains(i)) {
	    			return true;
	    		}
	    		seen.add(i);
	    	}
	    	
	    	return false;
	    	
	    	
	    	
	    	
//	    	
//	        for (int i = 0; i < nums.length; i++) {
//	            for (int j = i + 1; j < nums.length; j++) {
//	                if (nums[i] == nums[j]) {
//	                    return true;
//	                }
//	            }
//	        }
//	        return false;
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = { 1, 2, 3, 4, 1};
		
	boolean has	= hasDuplicates(nums);
	System.out.println(has);
		
	}

}

  