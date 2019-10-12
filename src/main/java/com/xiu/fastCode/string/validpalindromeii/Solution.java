package com.xiu.fastCode.string.validpalindromeii;

public class Solution {

    public boolean validPalindrome(String s) {
        
    	int left = 0;
    	int right = s.length() - 1;
    	
    	while (left <= right) {
    		
    		if(s.charAt(left) != s.charAt(right)) {
    			return deleteJuge(s, left+1, right)|| deleteJuge(s, left, right-1);
    		}else {
				left ++;
				right --;
			}
    		
		}
    	
    	return true;
    }
    
    public Boolean deleteJuge(String s, int start , int end) {
    	
    	while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            else
            {
                end--;
                start++;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
		
    	Solution solution = new Solution();
    	System.out.println(solution.validPalindrome("abc"));
	}
    
}
