
public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {3,4,5,6};
		int target = 7;
		
		
	int	is[] = twoSums(nums, target);
	for(int i : is) {
	System.out.print(i);
	}

	}

	private static int[] twoSums(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[0];
		
	}

}
