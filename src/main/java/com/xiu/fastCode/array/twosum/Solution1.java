package com.xiu.fastCode.array.twosum;

import java.util.Arrays;

public class Solution1 {

	public static int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		for(int i = 0; i < length; i++)
			for (int j = i+1; j < length; j++) {
				if(nums[i]+nums[j] == target) {
					return  new int[]{i,j};
				}
			}
		return new int[] {-1,-1};
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
	}
	
	
	
	
}
