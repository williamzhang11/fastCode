package com.xiu.fastCode.string.implementstrstr;

public class Solution2 {

    public int strStr(String haystack, String needle) {
    	
    	int originLen = haystack.length();
    	int targetLen = needle.length();
    	
    	if(targetLen==0) {
    		return 0;
    	}
    	int i = 0, j = 0;
    	//遍历条件
    	while(i < originLen && j < targetLen) {
    		//比较haystack与needle字符串，不匹配则需要回溯(j=0;i=i-j+1)
    		if(haystack.charAt(i) != needle.charAt(j)) {
    			
    			i=i-j+1;
    			j=0;
    			//匹配则++
    		}else {
    			i++;
    			j++;
        		
    		}
    	}
    	//遍历结束后，判断j与目标字符串长度，相等说明找到
    	if(j == targetLen) {
    		
    		return i-j;
    	}
    	else {
			
    		return -1;
		}
    }
    
    public static void main(String[] args) {
    	Solution2 solution = new Solution2();
    	
    	 System.out.println(solution.strStr("abcdefg", "f"));
	}
}
