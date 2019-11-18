package com.xiu.fastCode.mycode;

import java.util.Arrays;

/**
 * 归并排序
 * 先划分分解，再合并
 * 排序是在合并时进行的
 * @author william
 *
 */
public class MergeSort {

	public int[] sort(int [] array) {
		
		if(array.length <2 ) return array;
		
		int mid = array.length/2;
		
		int [] left = Arrays.copyOfRange(array, 0, mid);
		int [] right = Arrays.copyOfRange(array, mid, array.length);

		return merge(sort(left), sort(right));
	}
	//合并时进行
	public int[] merge(int[] left,int[] right) {
		
		int[] result = new int[left.length + right.length];
		
		for(int index = 0, i = 0, j = 0;index < result.length ;index++) {
			
			//left，right均不为空
			if(i< left.length  && j< right.length) {
				if(left[i] < right[j]) {
					result[index] = left[i];
					i++;
				}else {
					result[index] = right[j];
					j++;
				}
			}else {
				//right为空
				if(i< left.length) {
					result[index] = left[i];
					i++;
				}
				//left为空
				if(j< right.length) {
					result[index] = right[j];
					j++;
				}
			}
		
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] a = {4,2,6,9};
		MergeSort mergeSort = new MergeSort();
		System.out.println(Arrays.toString(mergeSort.sort(a)));
	}
}
