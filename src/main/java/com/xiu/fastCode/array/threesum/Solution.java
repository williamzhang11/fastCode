package com.xiu.fastCode.array.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 基于双指针实现。
 * 
 * 时间复杂度 O(N^2)
 * LeetCode 结果：36 ms
 *
 */
public class Solution {
	
	public List<List<Integer>> threeSum(int[] nums){
		
		int i=1;
		int len = nums.length,j=nums.length-1;
		List<List<Integer>> aList = new ArrayList<List<Integer>>();
		
		Arrays.sort(nums);
		
		for(int k=0; k<len-2; k++) {
			
			if(nums[k] > 0) break;
			//k去重 
			if(k >0 && nums[k]==nums[k-1]) continue;
			
			i = k+1;
			j = len-1;
			while (i < j) {
				
				if(nums[k]+nums[i]+nums[j] == 0) {
					
					aList.add(new ArrayList<Integer>(Arrays.asList(new Integer[] {nums[k],nums[i],nums[j]})));
					//i，j去重
					while(i < j && nums[i] == nums[++i]);
					while(i < j && nums[j] == nums[--j]);
				}
				
				if(nums[k]+nums[i]+nums[j] > 0) {
					j--;
				}
				if(nums[k]+nums[i]+nums[j] < 0) {
					i++;
				}
				
			}
			
		}
		return aList;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
	}
}
