package Sri;

public class Test2 {
	
//	int[] a= {4,3,2};
//	int[] b= {1,2,3,4};
	
	public int[] twoSum(int[] nums, int target) {
		for(int i=0;i<=nums.length-1;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
				int complement=target-nums[i];
				
				if(nums[j]==complement) 
					return new int[] {i,j};
				
			}
		}
		return null;
	
	}
	
public static void main(String[] args) {
	Test2  tt=new Test2();
	int[] nums= {4,3,2};
	int [] g=tt.twoSum(nums, 5);
	for(int s:g) {
		System.out.println(s);
	}
	
	
}
	
}