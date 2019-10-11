package com.xiu.fastCode.string.isomorphicstrings;

public class Solution {

	public boolean isIsomorphic(String s, String t) {

		int[] indexs = new int[128];
		int[] indext = new int[128];
		
		for(int i = 0; i < s.length();i++) {
			
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			if(indexs[sc] != indext[tc]) {
				return false;
			}
			
			indexs[sc] = indext[tc]= i+1;
		}
		
        return true;
    }
	
	
	
	
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("aa", "ab"));
  //      System.out.println(solution.isIsomorphic("ab", "ca"));
   //     System.out.println(solution.isIsomorphic("egg", "add"));
    }
	
}
