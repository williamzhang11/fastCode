package com.xiu.fastCode.mycode;

/**
 *二分查找：数组必须有序 
 *
 */
public class BinarySearch {

	//递归
	public int search(int[] array,int value,int left, int right) {
		
		if(left >right) return -1;
		
		int length = array.length;
		if(length == 1) return 0;
		if(length < 1) return -1;
		
		int middle = (left + right)/2;
		
		if(value < array[middle]) {
			return search(array, value, left, middle);
		}
		if(value > array[middle]) {
			return search(array, value, middle, right);	
		}else {
			return middle;
		}
		
	}
	//非递归
	public int noRecursion(int[] array,int value,int left,int right) {
		
		
		while(left <right) {
			int middle = (left +right) /2;
			if(value < array[middle]) {
				right =middle;
			}else if(value >array[middle]) {
				   left = middle;
			}else {
				return middle;
			}
			
		}
		
		return -1;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int [] array = {1,2,34,56,70,80,100,200,300};
		BinarySearch binarySearch = new BinarySearch();
		System.out.println(binarySearch.search(array,100,0,array.length-1));
		System.out.println(binarySearch.noRecursion(array,100,0,array.length-1));
	}
}
