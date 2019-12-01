package com.xiu.fastCode.mycode;

import java.util.ArrayList;

import com.xiu.fastCode.mycode.PrintListFromTailToHead.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author PC
 *
 */
public class ReverseList {
	
	
	public ListNode solution(ListNode head) {
		
		ListNode font = head;
		ListNode current = head;
		if(current.next ==null) return head;
		current = current.next;
		
        while(current!=null){
        	
        	
        }
        
        return head;
	}
	
	static public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public static void main(String[] args) {
		
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next=node2;
		node2.next=node4;
		node3.next=node4;
		
		
		System.out.println(new ReverseList().solution(node1));
	}

}
