package com.xiu.fastCode.string.validanagram;

import java.util.Arrays;

public class Solution {
	
    public boolean isAnagram(String s, String t) {
    	
    	if(s.length()!= t.length()) {
    		return false;
    	}
    	
    	char[] list = s.toCharArray();
    	Arrays.sort(list);
    	char[] list1 = t.toCharArray();
    	Arrays.sort(list1);
    	
    	return Arrays.equals(list, list1);
    	
/*    	int i =0;
    	while(i < list.length){
    		if(list[i]!= list1[i]) {
    			return false;
    		}
    		i++;
    	}
    	
    	return true;*/
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	
    	System.out.println(solution.isAnagram("rat", "car"));
	}
}
