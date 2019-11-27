package com.xiu.fastCode.mycode;
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author PC
 *
 *
 *开一个新字符串,在原来字符串上遍历，写入新字符串，遇到特殊字符，在新字符串上进行插入
 *
 */


public class ReplaceSpace {

	
	public String replace(StringBuffer str) {
		
		StringBuffer newStr = new StringBuffer();
		
		int length = str.length();
		int index = 0;
		while(index < length) {
			char char1 = str.charAt(index);
			if(char1==' ') {
				newStr.append("%20");
			}else {
				newStr.append(char1);
			}
			
			index ++;
		}
		
		
		return newStr.toString();
	}
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(new ReplaceSpace().replace(str));
		
	}
}
