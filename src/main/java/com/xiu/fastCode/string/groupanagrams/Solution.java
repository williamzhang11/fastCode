package com.xiu.fastCode.string.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {

	public List<List<String>> groupAnagrams(String[] strs){
		
		if(strs.length==0) return new ArrayList<List<String>>();
		
		Map<String,List<String>> mapList = new HashMap<String, List<String>>();
		
		for(String s : strs) {
			
			 char[] s1 = s.toCharArray();
			 Arrays.sort(s1);
			 String s2 = String.valueOf(s1);
			 if(!mapList.containsKey(s2)) {
				 
				 mapList.put(s2, new ArrayList<String>());
			 }
			 
			 mapList.get(s2).add(s);
			
		}
		
		return new ArrayList<List<String>>(mapList.values());
		
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(solution.groupAnagrams(strs));
	}
	
}
