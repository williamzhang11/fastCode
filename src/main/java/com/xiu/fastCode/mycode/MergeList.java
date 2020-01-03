package com.xiu.fastCode.mycode;


/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author PC
 * 
 * 思路：使用2个指针分别遍历2个链表，取出较小的，添加到新的链表，时间复杂度O(n)
 *
 */
public class MergeList {

	
    public ListNode Merge(ListNode list1,ListNode list2) {
        
    	ListNode head1 = list1;
    	ListNode head2 = list2;
    	ListNode head = null;
    	
    	if(head1.val > head2.val) {
    		head = new ListNode(head2.val);
    		head2 = head2.next;
    	}else {
    		head = new ListNode(head1.val);
    		head1 = head1.next;
		}
    	ListNode last = head;
    	
    	while(head1 != null && head2 != null) {
    		
    		if(head1.val > head2.val) {
    			last.next = head2;
    			head2 =head2.next;
    		}else {
    			last.next = head1;
    			head1 = head1.next;
    		}
    		
    		last = last.next;
    	}
    	
    	
    	if(head1 ==null) {
    		last.next = head2;
    	}
    	
    	if(head2 == null) {
    		last .next = head1;
    	}
    	
    	return head;
    }
    
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node5 = new ListNode(5);
		ListNode node7 = new ListNode(7);

		ListNode node2 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		ListNode node6 = new ListNode(6);
		
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		
		
		node2.next = node4;
		node4.next = node6;
		
		MergeList MergeList = new MergeList();

		System.out.println(MergeList.Merge(node1, node2));
	}
    
    
}
