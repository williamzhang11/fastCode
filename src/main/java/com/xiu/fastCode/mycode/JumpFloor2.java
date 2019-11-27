package com.xiu.fastCode.mycode;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author PC
 *	1:1
 *  2:2
 *  3:4
 *  4:8
 *
 */
public class JumpFloor2 {
	
	public static int solution(int target) {
		
		if(target == 1 || target == 0) return 1;
		if(target == 2) return 2;
		int sum =0;
		
		while(target >0) {
			target--;
			sum+=solution(target);
			
		}
		
		return sum;
		
/*		if(target==0||target==1)
            return 1;
        if(target==2)
            return 2;
        int sum = 0;
        for(int i=0;i<target;i++){
            sum += solution(i);
        }
        return sum;*/
	}
	
	
	public static int solution1(int target,int sum) {
		
		if(target == 1 || target == 0) return 1;
		if(target == 2) return 2;
		
		while(target >0) {
			target--;
			sum+=solution1(target,sum);
			
		}
		
		return sum;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(solution1(4,0));
	}
}






























