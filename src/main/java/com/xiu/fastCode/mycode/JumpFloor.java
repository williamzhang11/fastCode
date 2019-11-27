package com.xiu.fastCode.mycode;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 * @author PC
 * 
 * 1阶：1种
 * 2阶：2种
 * 3阶：3种
 * 4阶：5种
 * 斐波拉契数列
 *
 */
public class JumpFloor {
	
	public int solution(int n) {
		
		if(n==1) return 1;
		if(n==2) return 2;
		
		return solution(n-1)+solution(n-2);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new JumpFloor().solution(4));
	}

}















