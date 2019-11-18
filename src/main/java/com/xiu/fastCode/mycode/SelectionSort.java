package com.xiu.fastCode.mycode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 选择排序
 * 在未排序的序列中找到最小（大）元素存放到排序序列的起始位置，然后再从未排序序列中继续寻找
 * 
 * 
 * 
 * @author william
 *
 */
public class SelectionSort {

	public void sort(int[] array) {
		
		int length = array.length;
		
		for(int i = 0; i <length;i++) {
			
			int minValue = array[i];
			int minKey =i;
			for (int j = i; j < array.length; j++) {
				if( array[j] < minValue) {
					minValue = array[j];
					minKey = j;
				}
			}
			
			if(array[i] != minValue) {
				swap(array, i,minKey);
			}
			
		}
		
	}
	
	public void swap(int [] array, int i,int minKey) {
		
		int temp = array[i];
		array[i] = array[minKey];
		array[minKey] = temp;
	}
	
	
	public static void main(String[] args) {
		
		int[] array= {3,5,67,1,0};
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
}
