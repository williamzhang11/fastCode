package com.xiu.fastCode.mycode;
/**
 * 递归
 *
 */
public class Recursion {

	//阶乘：10！=10*9*8...1
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	//斐波拉契数列：1,1,2,3,5,8...
	public int fibonacci(int n) {
		
		if(n <=2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		
		System.out.println("阶乘："+recursion.factorial(3));
		
		System.out.println("斐波拉契："+recursion.fibonacci(6));
	}
}
