package com.xiu.fastCode.mycode;

import java.util.Arrays;

/**
 * 快速排序：
 * 设定一个基准，比基准小的放到左边，比基准大的放到右边，依次类推
 * （1）在数据集之中，选择一个元素作为"基准"（pivot）。

       （2）所有小于"基准"的元素，都移到"基准"的左边；所有大于"基准"的元素，都移到"基准"的右边。

       （3）对"基准"左边和右边的两个子集，不断重复第一步和第二步，直到所有子集只剩下一个元素为止。
 * 
 * @author william
 *
 */
public class QuickSort {
	
	public  void sort(int[] array, int low, int high) {
		
        if(low>high){
        	return ;
        }
		int base = array[low];
		
		int left = low;
		int right = high;
		while(left < right) {
			//右边找到第一个比基准小的值
			while(array[right] >= base && left <right) right --;
			//左边找到第一个比基准大的值
			while(array[left] <= base && left <right) left ++;
			
			//符合条件就交换
			if(left < right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
		
		//交换基准与left，right相遇的值
		array[low] = array[right];
		array[right] = base;
		//递归左边
		sort(array, low, left-1);
		//递归右边
		sort(array, left+1, high);
		
	}
	
	public static void main(String[] args) {
		int[] array = {5,1,4,2,7,6};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
