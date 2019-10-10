package com.xiu.fastCode.string.implementstrstr;

public class Solution1 {

    public int strStr(String haystack, String needle) {
    	
    	int strLen = haystack.length(),subLen = needle.length();
    	
    	if(needle.trim().length()==0) {
    		return 0;
    	}
    	
    	for(int index =0;index < strLen;index ++) {
    		
    		if(needle.charAt(0)!= haystack.charAt(index))
    			continue;
    		
    		if(index + subLen > strLen) break;
    		int temp = index+1;
    		for(; temp < index+ subLen;temp ++) {
    			
    			if(haystack.charAt(temp) != needle.charAt(temp-index)) {
    				break;
    			}
    		}
    			if(temp == index+subLen) return index;
    		
    		
    	}

    	return -1;
    }
    
    public static void main(String[] args) {
    	Solution1 solution = new Solution1();
    	
    	 System.out.println(solution.strStr("abcdefg", "cd"));
	}
}
