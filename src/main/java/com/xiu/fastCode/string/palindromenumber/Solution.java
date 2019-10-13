package com.xiu.fastCode.string.palindromenumber;

public class Solution {

	public boolean isPalindrome(int x) {
		
		if(x < 0 || (x %10==0 && x !=0)) {
			
			return false;
		}
		
		int y = 0;
		
		while(x > y) {
			y = y * 10 + x % 10;
			x = x/10;
		}
		
		return x == y ||x == y / 10;
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(121));
	}
}
