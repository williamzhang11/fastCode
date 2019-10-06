package com.xiu.fastCode.array.threesumclosest;

import java.util.Arrays;

//排序加双指针
//教训，思考好后再写代码，思路尽量量化
public class Solution2 {

    public int threeSumClosest(int[] nums, int target) {
        
    	Arrays.sort(nums);
    	int len = nums.length;
    	int minSum = nums[0]+nums[1]+nums[2];
    	
    	for(int k=0; k < len-2; k++) {
    		int left = k+1,right = len-1;
    		while (left < right) {
    			int range = target - (nums[k] + nums[left] + nums[right]);
    			//如果当前的差值小于上一次插值
    			if(Math.abs(range) < Math.abs(target-minSum)) {
    				minSum = nums[k] + nums[left] + nums[right];
    			}
    			if(range < 0) {
    				right --;
    			}else if(range > 0){
					left ++;
				}else {
					return minSum;
				}
    			
    			
			}
    		
    	}
    	
    	return minSum;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution2().
				threeSumClosest(new int[] {-10,0,-2,3,-8,1,-10,8,-8,6,-7,0,-7,2,2,-5,-8,1,-4,6}, 18));
	}
    
    
}
