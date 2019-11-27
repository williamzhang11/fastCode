package com.xiu.fastCode.mycode;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author PC
 *
 *stack2不为空，可以直接取出来
 *stack2为空，则需要先把stack1中所有元素先压入stack2再取出                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
 *
 *
 */

import java.util.Stack;

public class TwoStack {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
    public void push(int node) {
        
    	stack1.push(node);
    
    }
    
    public int pop() {
    	if(stack2.size() <=0) {
	    	while(!stack1.empty()) {
	    		stack2.push(stack1.pop());
	    	}
    	}
    	
    	return stack2.pop();
    }
    
    public static void main(String[] args) {
    	
    	TwoStack twoStack = new TwoStack();
    	for(int i=0;i<10;i++) {
    		twoStack.push(i);
    	}
    	
    	System.out.println(twoStack.pop());

	}

}
