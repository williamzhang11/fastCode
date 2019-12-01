package com.xiu.fastCode.mycode;

public class ReverseString {

	/**
	 * 123456789 反转成 987654321
	 * @param value
	 * @return
	 */
	public String solution(String value) {
		
		if(value == null ||value.length() == 0) return value;
		
		char[] valueChar=value.toCharArray();
		int length = valueChar.length;
		int i = 0, j = length-1;
		
		while(i < j) {
			char temp = valueChar[i];
			valueChar[i] = valueChar[j];
			valueChar[j] = temp;
			i++;
			j--;
		}
		
		return new String(valueChar);
	}
	
	/**
	 * 中点各自反转，如“123456789”——》“432159876”
	 * 
	 * 第一步:找到中点，按照长度奇偶数进行划分
	 * 第二步：反转
	 * @param value
	 * @return
	 */
	public String solution1(String value) {
		
		int length = value.length();
		if(value == null || length == 0 || length == 1) return value;
		
		int middle = length / 2;
		//奇数
		if(length % 2 ==1) {
			
			return solution(value.substring(0, middle))+value.charAt(middle)+solution(value.substring(middle+1));
			
		// 偶数
		}else if(length % 2 ==0){
			return solution(value.substring(0, middle))+solution(value.substring(middle));
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		
		String value ="123456789";
		System.out.println(new ReverseString().solution1(value));
		
	}
	
}
