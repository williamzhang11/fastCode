package com.xiu.fastCode.string.validanagram;


public class Solution2 {
	
    public boolean isAnagram(String s, String t) {
    	
    	if(s.length()!= t.length()) {
    		return false;
    	}
    	
    	int[] counter = new int[26];
    	
    	for(int i =0;i<s.length();i++) {
    		counter[s.charAt(i)-'a']++;
    		counter[t.charAt(i)-'a']--;
    	}
    	
    	for(int c : counter) {
    		if(c != 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public static void main(String[] args) {
    	Solution2 solution = new Solution2();
    	
    	System.out.println(solution.isAnagram("rac", "car"));
	}
}
