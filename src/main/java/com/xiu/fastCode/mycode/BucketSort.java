package com.xiu.fastCode.mycode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageTypeSpecifier;

/**
 * 找出最大值，最小值，将最大值与最小值之间的数进行分桶，
 * 
 * 将这些数，映射到桶中，然后对桶中元素分别进行排序
 * 
 * @author william
 *
 */
public class BucketSort {

	public int[] sort(int[] array,int size){
		
		
		int length = array.length;
		
		if(length <2) {
			return array;
		}
		
		int min = array[0];
		int max = array[0];
		
		for(int i =0;i<length;i++) {
			
			if(min > array[i]) {
				min = array[i];
			}
			
			if(max < array[i]) {
				max = array[i];
			}
		}
		List<List<Integer>> listList = new ArrayList<List<Integer>>(size);
		
		for(int j =0;j<size;j++) {
			List<Integer> list = new ArrayList<Integer>();
			listList.add(list);
		}
		int temp = (max -min)/size;
		for(int i =0;i<length;i++) {
			listList.get((temp/size)).add(array[i]);
		}
		
		for(List<Integer> list:listList) {
			list.sort(null);
		}
		int[] newArray = new int[length];
		int num=0;
		for(List<Integer> list:listList) {
			for(Integer value: list) {
				
				newArray[num] = value;
				num++;
			}

		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
	
		BucketSort bucketSort = new BucketSort();
		
		int[] array = {5,3,21,8,9,13};
		
		System.out.println(Arrays.toString(bucketSort.sort(array, 4)));
	}
}
