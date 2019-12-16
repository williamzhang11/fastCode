package com.xiu.fastCode.mycode;

import java.util.Arrays;

/**
 * 冒泡排序：
 * 相邻的2个数依次比较，大的数向后移，第一轮过后，最后面的数为最大的数
 * 第二轮过后，会把第二大的数移到最后面最大数的前面
 * 依次类推
 * 
 * 
 * 冒泡排序法 口诀：
     外层循环 0到n-1      //控制比较轮数   n 表示元素的个数
     内层循环 0到n-i-1     //控制每一轮比较次数
     两两比较做交换
     
 * @author william
 *
 */
public class BubbleSort {

	public void sort(int [] array) {
		
		int length = array.length;
		//i,控制趟数，j，控制第i趟的次数
		for(int i = 0; i <length -1;i++)
			for(int j = 0; j < length -1 -i; j++) {
				if(array[j] >array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		
	}
	
	public static void main(String[] args) {
		
		int [] a = {5,4,7,10,5,11};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		
		
		
	}
}
