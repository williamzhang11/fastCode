package com.xiu.fastCode.mycode;

import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

//二维数组
/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author PC
 * 通过观察发现左下角的数比上方的数据都要大，比右方的数据都要小
 *记录当前坐标
 *如果target比当前数据大，往左走，如果比当前数据小，往上走
 *直到走完全部
 */
public class DoubleArray {
	
	//非递归
	public Boolean isExitValue(int target,int [][] array) {
		
		if(array == null) {
			return false;
		}
		int heigh = array.length-1;
		int width = array[0].length-1;
		//出发地址
		int h = heigh ,w=0;
		
		while(h>=0 && w <=width) {
			
			if(array[h][w] == target)return true;
			if(target> array[h][w]) {
				w++;
			}else if(target < array[h][w]) {
				h--;
			}
			
		}
		
		return false;
		
	}
	
	//递归
	Boolean findValue(int target, int[][] array,int h,int w,int length) {
		
		
		if(h < 0 || w > length) return false;
		
		if( target == array[h][w]) return true;
		
		if(target > array[h][w]) {
			 return findValue(target, array, h, ++w, length);
		}
		
		if(target < array[h][w]) {
			return findValue(target, array, --h, w, length);
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		
		
		int[][] array = {{1,2,8,9},{4,7,10,13},{6,8,11,15}};
		
		//System.out.println(new DoubleArray().isExitValue(19,array ));
		System.out.println(new DoubleArray().findValue(100,array,array.length-1,0,array[0].length-1 ));
		
		
	}
}
