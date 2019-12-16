package com.xiu.fastCode.mycode;

import java.util.Stack;

public class FindKthToTail {

	// 利用栈
	public ListNode solution(ListNode head, int k) {

		Stack<ListNode> stack = new Stack<ListNode>();

		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		while (k > 1) {
			stack.pop();
			k--;
		}
		return stack.pop();

	}

	// 快慢指针：快指针先走k步，然后快慢指针一起走，当快指针为null时，慢指针的值为倒数k个数

	public ListNode solution1(ListNode head, int k) {

		if (head == null)
			return null;
		ListNode fast = head;
		ListNode slow = head;
		int q = k;
		while (q > 0) {
			if (fast == null)
				return null;
			fast = fast.next;
			q--;
		}

		while (fast != null) {

			fast = fast.next;
			slow = slow.next;
			k--;
		}

		return slow;

	}

	static class ListNode {
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
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;

		FindKthToTail findKthToTail = new FindKthToTail();

		System.out.println(findKthToTail.solution1(node1, 1).val);
	}

}
