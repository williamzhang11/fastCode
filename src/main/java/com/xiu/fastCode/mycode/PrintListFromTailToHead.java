package com.xiu.fastCode.mycode;
/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author PC
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintListFromTailToHead {

	
	//利用栈
	public ArrayList<Integer> print(ListNode listNode){
		
		Stack<Integer> queue = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(listNode!=null) {
			
			queue.add(listNode.value);
			listNode = listNode.next;
		}
		while(!queue.empty()) {
			
			Integer value=queue.pop();
			list.add(value);
			
		}
	
		return list;
	}
	
	
	public ArrayList<Integer> print1 (ListNode listNode){
		List<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		while(listNode!=null) {
			
			array.add(listNode.value);
			listNode = listNode.next;
		}
		
		int len = array.size()-1;
		while(len >=0) {
			
			array1.add(array.get(len));
			len --;
		}
		
		return array1;
	}
	
	static class ListNode {
		
		Integer value;
		ListNode next =null;
		
		public ListNode(Integer value) {
			this.value = value;
		}
		
		public void add(ListNode listNode) {
			this.next = listNode;
		}

	}
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.add(node2);
		node2.add(node3);
		node3.add(node4);
		
		ArrayList<Integer> arrayList = new PrintListFromTailToHead().print1(node1);
		
		System.out.println(arrayList);
		
		
	}
}
