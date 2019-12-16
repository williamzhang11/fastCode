package com.xiu.fastCode.mycode;

import java.util.ArrayList;

import com.xiu.fastCode.mycode.PrintListFromTailToHead.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author PC
 * 3个指针，pre指向前一个节点
 * cur指向当前节点
 * next指向下一个节点
 *
 */
public class ReverseList {
	
	
	public ListNode solution(ListNode head) {
		
		if(head == null && head.next == null) {
			return head;
		}
		
		ListNode preNode = null;
		ListNode curNode = head;
		ListNode nextNode = null;
		
		while(curNode != null) {
			nextNode = curNode.next;//nextNode 指向下一个节点
			curNode.next = preNode;//将当前节点next域指向前一个节点
			preNode = curNode;//preNode 指针向后移动
			curNode = nextNode;//curNode指针向后移动
			
		}
		
		return preNode;
		
		
	}
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		
		ListNode node = new ReverseList().solution(node1);
		
		while(node != null) {
			System.out.print(node.val+"->");
			node = node.next;
		}
		
		
	}
	
	static public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	

}

























