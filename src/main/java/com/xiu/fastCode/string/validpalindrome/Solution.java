package com.xiu.fastCode.string.validpalindrome;


public class Solution {

	public boolean isPalindrome(String s) {
		
		int left =0 ; 
		int right = s.length()-1;
		
		while(left < right) {
			
			if( !isVali(s.charAt(left)) ) {
				left ++;
				continue;
			}
			
			if(!isVali(s.charAt(right))) {
				right --;
				continue;
			}
			
			if(!isSame(s.charAt(left), s.charAt(right))) {
				return false;
			}
			left ++;
			right --;
		}
		
		return true;
	}
	
	public Boolean isVali(char a) {
		
		if(('0'<= a && a <='9') ||('a'<= a && a <= 'z') ||
				('A'<=a && a <= 'Z')) {
			return true;
		}
		
		return false;
	}
	
	public Boolean isSame(char a1, char a2) {
		
		if('A'<= a1 && a1<='Z') {
			a1 = (char)(a1 +32);
		}
		
		if('A'<= a2 && a2<='Z') {
			a2 = (char)(a2 +32);
		}
		
		return a1 == a2;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(solution.isPalindrome("Zeus was deified, saw Suez."));
	}

	
}
