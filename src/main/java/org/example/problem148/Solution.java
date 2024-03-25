package org.example.problem148;

public class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);

    }
    private ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while((fast.next != null) && (fast.next.next != null)){
            slow = slow.next;
            fast = fast.next.next;
        } return slow;

    }
    private ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        ListNode p1 = head1;
        ListNode p2 = head2;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                tail.next = p1;
                tail = tail.next;
                p1 = p1.next;
            }else{
                tail.next = p2;
                tail = tail.next;
                p2 = p2.next;
            }
        }
        if (p1 != null){
            tail.next = p1;
        }
        if (p2 != null){
            tail.next = p2;
        }
        return dummy.next;
    }

    private ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = getMiddle(head);
        ListNode head2 = middle.next;
        middle.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(head2);
        return merge(left,right);

    }


}
