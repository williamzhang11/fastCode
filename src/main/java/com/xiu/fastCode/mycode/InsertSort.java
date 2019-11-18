package com.xiu.fastCode.mycode;

import java.util.Arrays;

/**
 * 
 * 插入排序：
 * 将未排好序的数列中，按照顺序插入到已经排好序的数列中
 * 插入时从后向前对比
 * 
 * 
 * @author william
 *
 */
public class InsertSort {
	
	public void sort(int[] array) {
		
		int length = array.length;
		for(int i = 1;i < length;i++) {
			
			int preIndex = i-1;
			int current = array[i];
			for( ;preIndex >=0 && current < array[preIndex];preIndex--  ) {
				array[preIndex +1] = array[preIndex];
			}
			
			array[preIndex +1] = current;
		}
		
	}
	public static void main(String[] args) {
		
		int [] a = {7,10,5,11}; 
		InsertSort insertSort = new InsertSort();
		insertSort .sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
