package com.xiu.fastCode.array.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

	public static int[] twoSum(int[] nums, int target) {
		//key:nums中的元素，value: nums中的index
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length,1.0f);
		
		int length = nums.length;
		for(int i=0; i < length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {i,map.get(target-nums[i])};
			}
			
			map.put(nums[i], i);
		}
			
		return new int[] {-1,-1};
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 5)));
	}
	
	
	
	
}
