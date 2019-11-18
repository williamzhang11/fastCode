package com.xiu.fastCode.string.reversestring;

public class Solution {

    public void reverseString(char[] s) {
        if(s.length ==0 || s==null) {
        	return;
        }
    	
    	int left = 0;
    	int right = s.length - 1;
    	
    	while(left < right) {
    		char temp = s[left];
    		s[left] = s[right];
    		s[right] = temp;
    		
    		left ++;
    		right--;
    	}
    	
    }
    
    public static void main(String[] args) {
/*		Solution solution = new Solution();
		
		char [] str = new char[] {'h','e','l','l','o'};
		solution.reverseString(str);
		System.out.println(str);*/
		
	System.out.println(4>> 1);	
	System.out.println(4<< 1);	
	
	
	}
}
