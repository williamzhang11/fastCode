package com.xiu.fastCode.array.twosumiiinputarrayissorted;

import java.util.Arrays;

public class Solution1 {
	//非递归写法
	public int[] twoSum(int[] numbers, int target) {
		
		int len = numbers.length;
		int start = 0;
		int end = len - 1;
		
		while (start < end) {
			
			if(numbers[start] + numbers[end] == target) {
				return new int[] {start+1,end+1};
			}else if (numbers[start]+ numbers[end] >target) {
				end --;
			}else {
				start ++;
			}
			
		}
		
		throw new IllegalArgumentException("no nums sum equals target");
	}
	//递归写法
	public int[] twoSum1(int[] numbers, int target, int start, int end) {
		
		if(numbers[start]+ numbers[end] == target) {
			return new int[] {start+1,end+1};
		}
		
		if(numbers[start] + numbers[end] >target) {
			return twoSum1(numbers, target, start, --end);
		}else {
			return twoSum1(numbers, target, ++start, end);
		}
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Arrays.toString(new Solution1().
		//		twoSum(new int[] {2, 7, 11, 15}, 9)));
		
		int [] array = {2, 7, 11, 15};
		
		System.out.println(Arrays.toString(new Solution1().
				twoSum1(array, 9, 0, array.length-1)));
		
	}
}
