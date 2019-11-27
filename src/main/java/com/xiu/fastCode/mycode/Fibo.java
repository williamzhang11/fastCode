package com.xiu.fastCode.mycode;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
	n<=39
	0,1,1,2,3,5,8
 * @author PC
 *
 */
public class Fibo {

	//递归
	public static int printFibo(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		return printFibo(n-1)+printFibo(n-2);
	}
	
	//非递归
	public static int printFibo1(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		int prePreValue =0;
		int preValue =1;
		int value =0;
		for(int i = 2;i <= n;i++) {
			value = prePreValue+preValue;
			prePreValue = preValue;
			preValue = value;
		}
		
		return value;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(printFibo1(5));
	}
}
