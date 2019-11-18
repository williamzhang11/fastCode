package com.xiu.fastCode.mycode;

import java.util.Arrays;

/**
 * 计数排序
 * 
 * 以空间换取时间，适合正整数排序
 * 
 * 将输入的数值转换成额外开辟的空间中
 * 
 * 1.找到最大值，最小值
 * 2.数组长度最大值-最小值+1
 * 3.遍历入数组，相同则数组value++
 * 4.遍历出数组
 * 
 * 
 * @author william
 *
 */
public class CountingSort {

	public int[] sort(int [] array) {
		
		
		if(array.length == 0) {
			return array;
		}
		
		int min =array[0];
		int max = array[0];
		
		for(int i =1;i<array.length;i++) {
			
			if(array[i] < min) {
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		int[] newarray = new int[max-min +1];
		int[] newarray1 = new int[array.length];
		
		for(int j=0;j < array.length;j++) {
			
			newarray[array[j]-min] ++;
		}
		
		int k1=0;
		for(int k=0;k<newarray.length;k++) {
			
			if(newarray[k]!=0) {
				
				newarray1[k1] = k+min;
				k1++;
			}
		}
		
		
		return newarray1;
	}
	
	public static void main(String[] args) {
		
		int[] array = {5,2,8,45,0};
		CountingSort countingSort = new CountingSort();
		System.out.println(Arrays.toString(countingSort.sort(array)));
		
		
		
	}
}
