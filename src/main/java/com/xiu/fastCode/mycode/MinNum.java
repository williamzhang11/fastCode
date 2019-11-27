package com.xiu.fastCode.mycode;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author PC
 * 
 * 从数组末尾开始扫描，如果前一个比当前元素一个大，则当前元素就是最小值
 *
 */
public class MinNum {
	
    public int minNumberInRotateArray(int [] array) {
        
    	int length = array.length;
    	
    	if(length == 0) {
    		return 0;
    	}else if(length == 1){
			return array[0];
		}
    	
    	int current = array[length-1];
    	for(int index = length-2; index > 0; index--) {
    		
    		if(current < array[index]) {
    			return current;
    		}
    		
    		current = array[index];
    	}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
		
    	int[] array = {};
    	System.out.println(new MinNum().minNumberInRotateArray(array));
	}
    

}
